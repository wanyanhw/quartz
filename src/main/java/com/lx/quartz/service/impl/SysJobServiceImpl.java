package com.lx.quartz.service.impl;

import com.lx.quartz.dao.SysJobDao;
import com.lx.quartz.entity.SysJobEntity;
import com.lx.quartz.service.SysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wyhw
 */
@Service
public class SysJobServiceImpl implements SysJobService {
    @Autowired
    private SysJobDao sysJobDao;

    @Override
    public List<SysJobEntity> list(SysJobEntity sysJobEntity) {
        return sysJobDao.list(sysJobEntity);
    }

    @Override
    public void start(String jobName, String groupName) {

    }
}
