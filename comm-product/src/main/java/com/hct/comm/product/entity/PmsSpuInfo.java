package com.hct.comm.product.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * spu信息(PmsSpuInfo)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsSpuInfo implements Serializable {
    private static final long serialVersionUID = 436843177863273330L;
    /**
    * 商品id
    */
    private Long id;
    /**
    * 商品名称
    */
    private String spuName;
    /**
    * 商品描述
    */
    private String spuDescription;
    /**
    * 所属分类id
    */
    private Long catalogId;
    /**
    * 品牌id
    */
    private Long brandId;
    
    private Double weight;
    /**
    * 上架状态[0 - 下架，1 - 上架]
    */
    private Object publishStatus;
    
    private Date createTime;
    
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuDescription() {
        return spuDescription;
    }

    public void setSpuDescription(String spuDescription) {
        this.spuDescription = spuDescription;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Object getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Object publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}