package com.hct.comm.member.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:53:46
 */
public class UmsMember implements Serializable {
    private static final long serialVersionUID = 402913635020433715L;
    /**
    * id
    */
    private Long id;
    /**
    * 会员等级id
    */
    private Long levelId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 手机号码
    */
    private String mobile;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 头像
    */
    private String header;
    /**
    * 性别
    */
    private Object gender;
    /**
    * 生日
    */
    private Object birth;
    /**
    * 所在城市
    */
    private String city;
    /**
    * 职业
    */
    private String job;
    /**
    * 个性签名
    */
    private String sign;
    /**
    * 用户来源
    */
    private Object sourceType;
    /**
    * 积分
    */
    private Integer integration;
    /**
    * 成长值
    */
    private Integer growth;
    /**
    * 启用状态
    */
    private Object status;
    /**
    * 注册时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getBirth() {
        return birth;
    }

    public void setBirth(Object birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Object getSourceType() {
        return sourceType;
    }

    public void setSourceType(Object sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
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