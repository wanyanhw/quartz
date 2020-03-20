package com.lx.quartz.service.impl;

import com.lx.quartz.dao.SysJobDao;
import com.lx.quartz.entity.SysJobEntity;
import com.lx.quartz.service.SysJobService;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wyhw
 */
@Service
public class SysJobServiceImpl implements SysJobService {
    @Autowired
    private SysJobDao sysJobDao;
    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    @Override
    public List<SysJobEntity> list(SysJobEntity sysJobEntity) {
        return sysJobDao.list(sysJobEntity);
    }

    @Override
    public boolean start(String jobName, String groupName, Integer id) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(jobName, groupName);
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        scheduler.resumeJob(jobKey);
        int resultCount = editJob(id, 1);
        return (resultCount == 1);
    }

    @Override
    public boolean pause(String jobName, String groupName, Integer id) throws SchedulerException {
        JobKey jobKey = JobKey.jobKey(jobName, groupName);
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        scheduler.pauseJob(jobKey);
        int resultCount = editJob(id, 0);
        return (resultCount == 1);
    }

    /**
     * 修改任务
     * @param id 任务Id
     * @param status 任务状态
     * @return int 影响数量
     */
    public int editJob(Integer id, Integer status) {
        SysJobEntity sysJobEntity = new SysJobEntity();
        sysJobEntity.setId(id);
        sysJobEntity.setStatus(status);
        return sysJobDao.edit(sysJobEntity);
    }
}
