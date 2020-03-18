package com.lx.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

public class QuartzTest {
    public static void main(String[] args) {
        try {
            // 创建调度器
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            // 定义job，并与任务绑定
            JobDetail jobDetail = newJob(QuartzJob.class)
                    .withIdentity("job1", "group1")
                    .build();

            // 定义trigger触发器规则，2s执行一次
            Trigger trigger = newTrigger()
                    .withIdentity("trigger1", "group2")
                    .startNow()
                    .withSchedule(
                            CronScheduleBuilder.cronSchedule("0/2 * * * * ?")
                    ).build();

            // 调度器将触发器和任务关联起来
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();

        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
