package com.hct.comm.product.entity;

import java.io.Serializable;

/**
 * spu属性值(PmsProductAttrValue)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsProductAttrValue implements Serializable {
    private static final long serialVersionUID = 752981617726390011L;
    /**
    * id
    */
    private Long id;
    /**
    * 商品id
    */
    private Long spuId;
    /**
    * 属性id
    */
    private Long attrId;
    /**
    * 属性名
    */
    private String attrName;
    /**
    * 属性值
    */
    private String attrValue;
    /**
    * 顺序
    */
    private Integer attrSort;
    /**
    * 快速展示【是否展示在介绍上；0-否 1-是】
    */
    private Object quickShow;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    public Object getQuickShow() {
        return quickShow;
    }

    public void setQuickShow(Object quickShow) {
        this.quickShow = quickShow;
    }

}