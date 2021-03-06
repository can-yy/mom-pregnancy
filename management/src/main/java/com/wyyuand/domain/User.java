package com.wyyuand.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_email
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_password
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_creatTime
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private Date userCreattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_sex
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_predate
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private Date userPredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_birthday
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private Date userBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_status
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_pic
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String userPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.baby_name
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String babyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.baby_pic
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    private String babyPic;

//    添加帖子

  /*  private List<Circle> circleList;


    public List<Circle> getCircleList() {
        return circleList;
    }

    public void setCircleList(List<Circle> circleList) {
        this.circleList = circleList;
    }*/

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_email
     *
     * @return the value of t_user.user_email
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_email
     *
     * @param userEmail the value for t_user.user_email
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_password
     *
     * @return the value of t_user.user_password
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_password
     *
     * @param userPassword the value for t_user.user_password
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_creatTime
     *
     * @return the value of t_user.user_creatTime
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getUserCreattime() {
        return userCreattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_creatTime
     *
     * @param userCreattime the value for t_user.user_creatTime
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserCreattime(Date userCreattime) {
        this.userCreattime = userCreattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_sex
     *
     * @return the value of t_user.user_sex
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_sex
     *
     * @param userSex the value for t_user.user_sex
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_predate
     *
     * @return the value of t_user.user_predate
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getUserPredate() {
        return userPredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_predate
     *
     * @param userPredate the value for t_user.user_predate
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserPredate(Date userPredate) {
        this.userPredate = userPredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_birthday
     *
     * @return the value of t_user.user_birthday
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_birthday
     *
     * @param userBirthday the value for t_user.user_birthday
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_status
     *
     * @return the value of t_user.user_status
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_status
     *
     * @param userStatus the value for t_user.user_status
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_pic
     *
     * @return the value of t_user.user_pic
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getUserPic() {
        return userPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_pic
     *
     * @param userPic the value for t_user.user_pic
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setUserPic(String userPic) {
        this.userPic = userPic == null ? null : userPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.baby_name
     *
     * @return the value of t_user.baby_name
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getBabyName() {
        return babyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.baby_name
     *
     * @param babyName the value for t_user.baby_name
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setBabyName(String babyName) {
        this.babyName = babyName == null ? null : babyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.baby_pic
     *
     * @return the value of t_user.baby_pic
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public String getBabyPic() {
        return babyPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.baby_pic
     *
     * @param babyPic the value for t_user.baby_pic
     *
     * @mbg.generated Thu Jul 04 19:40:51 CST 2019
     */
    public void setBabyPic(String babyPic) {
        this.babyPic = babyPic == null ? null : babyPic.trim();
    }
}