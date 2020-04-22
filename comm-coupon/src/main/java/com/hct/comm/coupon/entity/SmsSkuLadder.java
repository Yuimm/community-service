package com.hct.comm.coupon.entity;

import java.io.Serializable;

/**
 * 商品阶梯价格(SmsSkuLadder)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
public class SmsSkuLadder implements Serializable {
    private static final long serialVersionUID = -34100049927712900L;
    /**
    * id
    */
    private Long id;
    /**
    * spu_id
    */
    private Long skuId;
    /**
    * 满几件
    */
    private Integer fullCount;
    /**
    * 打几折
    */
    private Double discount;
    /**
    * 折后价
    */
    private Double price;
    /**
    * 是否叠加其他优惠[0-不可叠加，1-可叠加]
    */
    private Object addOther;


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

    public Integer getFullCount() {
        return fullCount;
    }

    public void setFullCount(Integer fullCount) {
        this.fullCount = fullCount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getAddOther() {
        return addOther;
    }

    public void setAddOther(Object addOther) {
        this.addOther = addOther;
    }

}