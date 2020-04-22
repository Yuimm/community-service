package com.hct.comm.member.entity;

import java.io.Serializable;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:53:49
 */
public class UmsMemberStatisticsInfo implements Serializable {
    private static final long serialVersionUID = 339066367310035967L;
    /**
    * id
    */
    private Long id;
    /**
    * 会员id
    */
    private Long memberId;
    /**
    * 累计消费金额
    */
    private Double consumeAmount;
    /**
    * 累计优惠金额
    */
    private Double couponAmount;
    /**
    * 订单数量
    */
    private Integer orderCount;
    /**
    * 优惠券数量
    */
    private Integer couponCount;
    /**
    * 评价数
    */
    private Integer commentCount;
    /**
    * 退货数量
    */
    private Integer returnOrderCount;
    /**
    * 登录次数
    */
    private Integer loginCount;
    /**
    * 关注数量
    */
    private Integer attendCount;
    /**
    * 粉丝数量
    */
    private Integer fansCount;
    /**
    * 收藏的商品数量
    */
    private Integer collectProductCount;
    /**
    * 收藏的专题活动数量
    */
    private Integer collectSubjectCount;
    /**
    * 收藏的评论数量
    */
    private Integer collectCommentCount;
    /**
    * 邀请的朋友数量
    */
    private Integer inviteFriendCount;


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

    public Double getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

}