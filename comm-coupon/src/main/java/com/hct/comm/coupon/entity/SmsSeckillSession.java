package com.hct.comm.coupon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 秒杀活动场次(SmsSeckillSession)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public class SmsSeckillSession implements Serializable {
    private static final long serialVersionUID = 257977647786925218L;
    /**
    * id
    */
    private Long id;
    /**
    * 场次名称
    */
    private String name;
    /**
    * 每日开始时间
    */
    private Date startTime;
    /**
    * 每日结束时间
    */
    private Date endTime;
    /**
    * 启用状态
    */
    private Object status;
    /**
    * 创建时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}