package com.hct.comm.product.entity;


import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;


/**
 * 商品三级分类(PmsCategory)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsCategory implements Serializable {
    private static final long serialVersionUID = -68231982295072756L;
    /**
    * 分类id
    */
    private Long catId;
    /**
    * 分类名称
    */
    private String name;
    /**
    * 父分类id
    */
    private Long parentCid;
    /**
    * 层级
    */
    private Integer catLevel;
    /**
    * 是否显示[0-不显示，1显示]
    */
    private Object showStatus;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 图标地址
    */
    private String icon;
    /**
    * 计量单位
    */
    private String productUnit;
    /**
    * 商品数量
    */
    private Integer productCount;

    /**
     * 商品分类的子分类
     */
    @TableField(exist = false)
    private List<PmsCategory> children;

    public List<PmsCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsCategory> children) {
        this.children = children;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public Object getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Object showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

}