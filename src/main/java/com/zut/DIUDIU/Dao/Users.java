package com.zut.DIUDIU.Dao;

/**
 * 
 * @date 2020/11/12
 */
public class Users {
    private Integer userid;

    private String username;

    private String userpassword;

    private String usersex;

    private String userimageurl;

    private String userqq;

    private String userphone;

    private String userstudentnumber;

    public Users(Integer userid, String username, String userpassword, String usersex, String userimageurl, String userqq, String userphone, String userstudentnumber) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.usersex = usersex;
        this.userimageurl = userimageurl;
        this.userqq = userqq;
        this.userphone = userphone;
        this.userstudentnumber = userstudentnumber;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserimageurl() {
        return userimageurl;
    }

    public void setUserimageurl(String userimageurl) {
        this.userimageurl = userimageurl;
    }

    public String getUserqq() {
        return userqq;
    }

    public void setUserqq(String userqq) {
        this.userqq = userqq;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserstudentnumber() {
        return userstudentnumber;
    }

    public void setUserstudentnumber(String userstudentnumber) {
        this.userstudentnumber = userstudentnumber;
    }
}