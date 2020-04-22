package com.hct.comm.product.entity;

import java.io.Serializable;

/**
 * 商品评价回复关系(PmsCommentReplay)实体类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public class PmsCommentReplay implements Serializable {
    private static final long serialVersionUID = -57123022338373468L;
    /**
    * id
    */
    private Long id;
    /**
    * 评论id
    */
    private Long commentId;
    /**
    * 回复id
    */
    private Long replyId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

}