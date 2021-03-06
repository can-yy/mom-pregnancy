package com.wyyuand.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CircleReply {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.reply_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String replyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.nick_name
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.comment_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.user_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.content
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.status
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.create_date
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle_reply.user_logo
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    private String userLogo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.reply_id
     *
     * @return the value of t_circle_reply.reply_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getReplyId() {
        return replyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.reply_id
     *
     * @param replyId the value for t_circle_reply.reply_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.nick_name
     *
     * @return the value of t_circle_reply.nick_name
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.nick_name
     *
     * @param nickName the value for t_circle_reply.nick_name
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.comment_id
     *
     * @return the value of t_circle_reply.comment_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.comment_id
     *
     * @param commentId the value for t_circle_reply.comment_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.user_id
     *
     * @return the value of t_circle_reply.user_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.user_id
     *
     * @param userId the value for t_circle_reply.user_id
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.content
     *
     * @return the value of t_circle_reply.content
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.content
     *
     * @param content the value for t_circle_reply.content
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.status
     *
     * @return the value of t_circle_reply.status
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.status
     *
     * @param status the value for t_circle_reply.status
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.create_date
     *
     * @return the value of t_circle_reply.create_date
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.create_date
     *
     * @param createDate the value for t_circle_reply.create_date
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_circle_reply.user_logo
     *
     * @return the value of t_circle_reply.user_logo
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public String getUserLogo() {
        return userLogo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_circle_reply.user_logo
     *
     * @param userLogo the value for t_circle_reply.user_logo
     *
     * @mbg.generated Tue Jul 09 15:01:41 CST 2019
     */
    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo == null ? null : userLogo.trim();
    }
}