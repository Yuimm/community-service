package com.hct.comm.ware.entity;

import java.io.Serializable;

/**
 * 库存工作单(WmsWareOrderTaskDetail)实体类
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
public class WmsWareOrderTaskDetail implements Serializable {
    private static final long serialVersionUID = -69471226406620041L;
    /**
    * id
    */
    private Long id;
    /**
    * sku_id
    */
    private Long skuId;
    /**
    * sku_name
    */
    private String skuName;
    /**
    * 购买个数
    */
    private Integer skuNum;
    /**
    * 工作单id
    */
    private Long taskId;


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

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

}