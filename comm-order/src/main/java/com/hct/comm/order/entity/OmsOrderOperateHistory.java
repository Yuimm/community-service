package com.hct.comm.order.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public class OmsOrderOperateHistory implements Serializable {
    private static final long serialVersionUID = -19382427830850251L;
    /**
    * id
    */
    private Long id;
    /**
    * 订单id
    */
    private Long orderId;
    /**
    * 操作人[用户；系统；后台管理员]
    */
    private String operateMan;
    /**
    * 操作时间
    */
    private Date createTime;
    /**
    * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
    */
    private Object orderStatus;
    /**
    * 备注
    */
    private String note;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Object getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Object orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}