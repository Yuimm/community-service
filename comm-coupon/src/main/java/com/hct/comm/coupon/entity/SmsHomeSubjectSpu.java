package com.hct.comm.coupon.entity;

import java.io.Serializable;

/**
 * 专题商品(SmsHomeSubjectSpu)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public class SmsHomeSubjectSpu implements Serializable {
    private static final long serialVersionUID = -73038886372834939L;
    /**
    * id
    */
    private Long id;
    /**
    * 专题名字
    */
    private String name;
    /**
    * 专题id
    */
    private Long subjectId;
    /**
    * spu_id
    */
    private Long spuId;
    /**
    * 排序
    */
    private Integer sort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}