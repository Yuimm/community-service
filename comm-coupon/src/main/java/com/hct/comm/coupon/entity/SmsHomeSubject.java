package com.hct.comm.coupon.entity;

import java.io.Serializable;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public class SmsHomeSubject implements Serializable {
    private static final long serialVersionUID = -11020643095763492L;
    /**
    * id
    */
    private Long id;
    /**
    * 专题名字
    */
    private String name;
    /**
    * 专题标题
    */
    private String title;
    /**
    * 专题副标题
    */
    private String subTitle;
    /**
    * 显示状态
    */
    private Object status;
    /**
    * 详情连接
    */
    private String url;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 专题图片地址
    */
    private String img;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}