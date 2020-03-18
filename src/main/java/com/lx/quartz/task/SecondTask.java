package com.lx.quartz.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * @author wyhw
 */
@Component
@EnableScheduling
public class SecondTask {

    void showTask() {
        System.out.println("执行第2个任务");
    }
}
