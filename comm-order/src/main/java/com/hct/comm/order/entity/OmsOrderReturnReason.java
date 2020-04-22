package com.hct.comm.order.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 退货原因(OmsOrderReturnReason)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public class OmsOrderReturnReason implements Serializable {
    private static final long serialVersionUID = 443316413252465069L;
    /**
    * id
    */
    private Long id;
    /**
    * 退货原因名
    */
    private String name;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 启用状态
    */
    private Object status;
    /**
    * create_time
    */
    private Date createTime;


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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}