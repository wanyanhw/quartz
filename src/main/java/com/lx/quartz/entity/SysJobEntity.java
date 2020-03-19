package com.lx.quartz.entity;

import lombok.Data;

/**
 * @author wyhw
 */
@Data
public class SysJobEntity {
    private Integer id;
    private String jobName;
    private String groupName;
    private String cronExpression;
    private int status;
    private String jobClassPath;
    private String description;
}
