package com.lx.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wyhw
 */
public class QuartzJob implements Job {
    private static int COUNT = 0;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("task 1 执行第" + (++COUNT) + "次");
    }

}
