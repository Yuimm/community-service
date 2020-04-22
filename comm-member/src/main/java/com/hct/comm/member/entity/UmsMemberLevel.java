package com.hct.comm.member.entity;

import java.io.Serializable;

/**
 * 会员等级(UmsMemberLevel)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:53:49
 */
public class UmsMemberLevel implements Serializable {
    private static final long serialVersionUID = 671360680422050051L;
    /**
    * id
    */
    private Long id;
    /**
    * 等级名称
    */
    private String name;
    /**
    * 等级需要的成长值
    */
    private Integer growthPoint;
    /**
    * 是否为默认等级[0->不是；1->是]
    */
    private Object defaultStatus;
    /**
    * 免运费标准
    */
    private Double freeFreightPoint;
    /**
    * 每次评价获取的成长值
    */
    private Integer commentGrowthPoint;
    /**
    * 是否有免邮特权
    */
    private Object priviledgeFreeFreight;
    /**
    * 是否有会员价格特权
    */
    private Object priviledgeMemberPrice;
    /**
    * 是否有生日特权
    */
    private Object priviledgeBirthday;
    /**
    * 备注
    */
    private String note;


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

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Object getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Object defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public Double getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(Double freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Object getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Object priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public Object getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Object priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Object getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Object priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}