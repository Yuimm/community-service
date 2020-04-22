package com.hct.comm.member.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员登录记录(UmsMemberLoginLog)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:53:49
 */
public class UmsMemberLoginLog implements Serializable {
    private static final long serialVersionUID = -26912215938963343L;
    /**
    * id
    */
    private Long id;
    /**
    * member_id
    */
    private Long memberId;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * ip
    */
    private String ip;
    /**
    * city
    */
    private String city;
    /**
    * 登录类型[1-web，2-app]
    */
    private Object loginType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getLoginType() {
        return loginType;
    }

    public void setLoginType(Object loginType) {
        this.loginType = loginType;
    }

}