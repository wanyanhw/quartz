package com.lx.quartz.dao.impl;

import com.lx.quartz.dao.SysJobDao;
import com.lx.quartz.entity.SysJobEntity;
import com.lx.quartz.mapper.SysJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wyhw
 */
@Component
public class SysDaoImpl implements SysJobDao {

    @Autowired
    private SysJobMapper sysJobMapper;

    @Override
    public List<SysJobEntity> list(SysJobEntity sysJobEntity) {
        return sysJobMapper.list(sysJobEntity);
    }
}
