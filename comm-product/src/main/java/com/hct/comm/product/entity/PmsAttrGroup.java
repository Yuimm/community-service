package com.hct.comm.product.entity;

import java.io.Serializable;

/**
 * 属性分组(PmsAttrGroup)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsAttrGroup implements Serializable {
    private static final long serialVersionUID = -19000716387633786L;
    /**
    * 分组id
    */
    private Long attrGroupId;
    /**
    * 组名
    */
    private String attrGroupName;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 描述
    */
    private String descript;
    /**
    * 组图标
    */
    private String icon;
    /**
    * 所属分类id
    */
    private Long catelogId;


    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public String getAttrGroupName() {
        return attrGroupName;
    }

    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

}