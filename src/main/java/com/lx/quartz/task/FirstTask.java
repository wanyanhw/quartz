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
public class FirstTask implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("执行第1个任务， " +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        String[] a = null;
        System.out.println(a[0]);
    }
}
