package com.hct.comm.coupon.entity;

import java.io.Serializable;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public class SmsSeckillSkuRelation implements Serializable {
    private static final long serialVersionUID = -12464142677689995L;
    /**
    * id
    */
    private Long id;
    /**
    * 活动id
    */
    private Long promotionId;
    /**
    * 活动场次id
    */
    private Long promotionSessionId;
    /**
    * 商品id
    */
    private Long skuId;
    /**
    * 秒杀价格
    */
    private Double seckillPrice;
    /**
    * 秒杀总量
    */
    private Double seckillCount;
    /**
    * 每人限购数量
    */
    private Double seckillLimit;
    /**
    * 排序
    */
    private Integer seckillSort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getPromotionSessionId() {
        return promotionSessionId;
    }

    public void setPromotionSessionId(Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Double getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(Double seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Double getSeckillCount() {
        return seckillCount;
    }

    public void setSeckillCount(Double seckillCount) {
        this.seckillCount = seckillCount;
    }

    public Double getSeckillLimit() {
        return seckillLimit;
    }

    public void setSeckillLimit(Double seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    public Integer getSeckillSort() {
        return seckillSort;
    }

    public void setSeckillSort(Integer seckillSort) {
        this.seckillSort = seckillSort;
    }

}