package com.hct.comm.product.entity;

import java.io.Serializable;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsSkuSaleAttrValue implements Serializable {
    private static final long serialVersionUID = 850392863335953202L;
    /**
    * id
    */
    private Long id;
    /**
    * sku_id
    */
    private Long skuId;
    /**
    * attr_id
    */
    private Long attrId;
    /**
    * 销售属性名
    */
    private String attrName;
    /**
    * 销售属性值
    */
    private String attrValue;
    /**
    * 顺序
    */
    private Integer attrSort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
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

}