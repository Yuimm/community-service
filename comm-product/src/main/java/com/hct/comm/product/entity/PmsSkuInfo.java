package com.hct.comm.product.entity;

import java.io.Serializable;

/**
 * sku信息(PmsSkuInfo)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsSkuInfo implements Serializable {
    private static final long serialVersionUID = -15670368526014186L;
    /**
    * skuId
    */
    private Long skuId;
    /**
    * spuId
    */
    private Long spuId;
    /**
    * sku名称
    */
    private String skuName;
    /**
    * sku介绍描述
    */
    private String skuDesc;
    /**
    * 所属分类id
    */
    private Long catalogId;
    /**
    * 品牌id
    */
    private Long brandId;
    /**
    * 默认图片
    */
    private String skuDefaultImg;
    /**
    * 标题
    */
    private String skuTitle;
    /**
    * 副标题
    */
    private String skuSubtitle;
    /**
    * 价格
    */
    private Double price;
    /**
    * 销量
    */
    private Long saleCount;


    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
    }

    public String getSkuSubtitle() {
        return skuSubtitle;
    }

    public void setSkuSubtitle(String skuSubtitle) {
        this.skuSubtitle = skuSubtitle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Long saleCount) {
        this.saleCount = saleCount;
    }

}