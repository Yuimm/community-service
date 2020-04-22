package com.hct.comm.product.entity;

import java.io.Serializable;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsAttrAttrgroupRelation implements Serializable {
    private static final long serialVersionUID = 705578942486456109L;
    /**
    * id
    */
    private Long id;
    /**
    * 属性id
    */
    private Long attrId;
    /**
    * 属性分组id
    */
    private Long attrGroupId;
    /**
    * 属性组内排序
    */
    private Integer attrSort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

}