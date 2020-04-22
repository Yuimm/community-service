package com.hct.comm.coupon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 优惠券信息(SmsCoupon)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:47
 */
public class SmsCoupon implements Serializable {
    private static final long serialVersionUID = 942611230641950615L;
    /**
    * id
    */
    private Long id;
    /**
    * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
    */
    private Object couponType;
    /**
    * 优惠券图片
    */
    private String couponImg;
    /**
    * 优惠卷名字
    */
    private String couponName;
    /**
    * 数量
    */
    private Integer num;
    /**
    * 金额
    */
    private Double amount;
    /**
    * 每人限领张数
    */
    private Integer perLimit;
    /**
    * 使用门槛
    */
    private Double minPoint;
    /**
    * 开始时间
    */
    private Date startTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 使用类型[0->全场通用；1->指定分类；2->指定商品]
    */
    private Object useType;
    /**
    * 备注
    */
    private String note;
    /**
    * 发行数量
    */
    private Integer publishCount;
    /**
    * 已使用数量
    */
    private Integer useCount;
    /**
    * 领取数量
    */
    private Integer receiveCount;
    /**
    * 可以领取的开始日期
    */
    private Date enableStartTime;
    /**
    * 可以领取的结束日期
    */
    private Date enableEndTime;
    /**
    * 优惠码
    */
    private String code;
    /**
    * 可以领取的会员等级[0->不限等级，其他-对应等级]
    */
    private Object memberLevel;
    /**
    * 发布状态[0-未发布，1-已发布]
    */
    private Object publish;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getCouponType() {
        return couponType;
    }

    public void setCouponType(Object couponType) {
        this.couponType = couponType;
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public Double getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(Double minPoint) {
        this.minPoint = minPoint;
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

    public Object getUseType() {
        return useType;
    }

    public void setUseType(Object useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Date getEnableStartTime() {
        return enableStartTime;
    }

    public void setEnableStartTime(Date enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    public Date getEnableEndTime() {
        return enableEndTime;
    }

    public void setEnableEndTime(Date enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Object memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Object getPublish() {
        return publish;
    }

    public void setPublish(Object publish) {
        this.publish = publish;
    }

}