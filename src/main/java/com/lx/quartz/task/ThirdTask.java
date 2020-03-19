package com.lx.quartz.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wyhw
 */
@Component
public class ThirdTask implements Job {

    void showTask() {
        System.out.println("执行第3个任务， " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        showTask();
    }
}
