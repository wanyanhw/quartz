package com.lx.quartz.controller;

import com.lx.quartz.service.SysJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping(value = "/start")
    public String startJob(String jobName, String groupName) {
        sysJobService.start(jobName, groupName);
        return "success";
    }

}
