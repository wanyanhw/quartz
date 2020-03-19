package com.lx.quartz.dao;

import com.lx.quartz.entity.SysJobEntity;

import java.util.List;

/**
 * @author wyhw
 */
public interface SysJobDao {
    /**
     * 查询任务
     * @param sysJobEntity 查询条件
     * @return 返回值
     */
    List<SysJobEntity> list(SysJobEntity sysJobEntity);
}
