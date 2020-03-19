package com.lx.quartz.config;

import com.lx.quartz.entity.SysJobEntity;
import com.lx.quartz.service.SysJobService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 程序启动执行，将数据库中所有状态为“1”的定时任务开启
 * @author wyhw
 */
@Component
public class StartRunConfig implements CommandLineRunner {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    @Autowired
    private SysJobService sysJobService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run 开始执行");
        try {
            SysJobEntity sysJobEntity = new SysJobEntity();
            sysJobEntity.setStatus(1);
            List<SysJobEntity> jobList = sysJobService.list(sysJobEntity);

            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            scheduler.start();
            for (SysJobEntity jobEntity : jobList) {
                JobDetail jobDetail = JobBuilder.newJob((Class<? extends Job>) Class.forName(jobEntity.getJobClassPath()))
                        .withIdentity(jobEntity.getJobName(), jobEntity.getGroupName())
                        .build();
                Trigger trigger = TriggerBuilder.newTrigger()
                        .startNow()
                        .withSchedule(
                                CronScheduleBuilder.cronSchedule(jobEntity.getCronExpression())
                        )
                        .build();
                scheduler.scheduleJob(jobDetail, trigger);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
