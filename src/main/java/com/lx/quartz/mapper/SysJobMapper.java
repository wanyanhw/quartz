package com.lx.quartz.mapper;

import com.lx.quartz.entity.SysJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wyhw
 */
@Mapper
public interface SysJobMapper {
    /**
     * 查询所有任务
     * @param sysJobEntity 查询条件
     * @return 返回值
     */
    List<SysJobEntity> list(SysJobEntity sysJobEntity);
}
