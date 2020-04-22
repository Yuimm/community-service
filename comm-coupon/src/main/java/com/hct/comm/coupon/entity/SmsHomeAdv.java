package com.hct.comm.coupon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 首页轮播广告(SmsHomeAdv)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public class SmsHomeAdv implements Serializable {
    private static final long serialVersionUID = 977034298772360361L;
    /**
    * id
    */
    private Long id;
    /**
    * 名字
    */
    private String name;
    /**
    * 图片地址
    */
    private String pic;
    /**
    * 开始时间
    */
    private Date startTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 状态
    */
    private Object status;
    /**
    * 点击数
    */
    private Integer clickCount;
    /**
    * 广告详情连接地址
    */
    private String url;
    /**
    * 备注
    */
    private String note;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 发布者
    */
    private Long publisherId;
    /**
    * 审核者
    */
    private Long authId;


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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

}