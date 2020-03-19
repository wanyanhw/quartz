package com.lx.quartz.service;

import com.lx.quartz.entity.SysJobEntity;

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
     * @param jobName
     * @param groupName
     */
    void start(String jobName, String groupName);
}
