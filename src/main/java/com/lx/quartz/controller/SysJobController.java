package com.lx.quartz.controller;

import com.lx.quartz.service.SysJobService;
import org.apache.ibatis.annotations.Param;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务管理controller
 * @author wyhw
 */
@RestController
@RequestMapping(value = "/job")
public class SysJobController {

    @Autowired
    private SysJobService sysJobService;

    @PostMapping(value = "/start")
    public boolean start(@RequestParam String jobName, @RequestParam String groupName, @RequestParam Integer id) throws SchedulerException {
        return sysJobService.start(jobName, groupName, id);
    }

    @PostMapping(value = "/pause")
    public boolean pause(@RequestParam String jobName, @RequestParam String groupName, @RequestParam Integer id) throws SchedulerException {
        return sysJobService.pause(jobName, groupName, id);
    }
}
