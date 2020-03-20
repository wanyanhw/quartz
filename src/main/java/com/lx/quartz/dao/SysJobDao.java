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

    /**
     * 编辑任务
     * @param sysJobEntity 传入参数
     * @return 影响结果数量
     */
    int edit(SysJobEntity sysJobEntity);
}
