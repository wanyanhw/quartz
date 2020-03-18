package com.lx.quartz.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * @author wyhw
 */
@Component
@EnableScheduling
public class ThirdTask {

    void showTask() {
        System.out.println("执行第3个任务");
    }
}
