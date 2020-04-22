package com.hct.comm.coupon.entity;

import java.io.Serializable;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public class SmsCouponSpuRelation implements Serializable {
    private static final long serialVersionUID = 414150009459366759L;
    /**
    * id
    */
    private Long id;
    /**
    * 优惠券id
    */
    private Long couponId;
    /**
    * spu_id
    */
    private Long spuId;
    /**
    * spu_name
    */
    private String spuName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

}