package com.lx.quartz.service;

import com.lx.quartz.entity.SysJobEntity;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * @author wyhw
 */
public interface SysJobService {
    /**
     * 查询任务
     * @param sysJobEntity 查询条件
     * @return 返回值
     */
    List<SysJobEntity> list(SysJobEntity sysJobEntity);

    /**
     * 开启任务
     * @param jobName 任务名称
     * @param groupName 组名称
     * @param id 任务id
     * @throws SchedulerException 异常信息
     * @return boolean 成功-true，失败-false
     */
    boolean start(String jobName, String groupName, Integer id) throws SchedulerException;

    /**
     * 暂停任务
     * @param jobName 任务名称
     * @param groupName 分组名称
     * @param id 任务ID
     * @throws SchedulerException 异常信息
     * @return boolean 成功-true，失败-false
     */
    boolean pause(String jobName, String groupName, Integer id) throws SchedulerException;
}
