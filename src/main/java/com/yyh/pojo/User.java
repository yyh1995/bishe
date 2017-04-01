package com.yyh.pojo;

public class User {
    private Integer id;

    private String uname;

    private String uaccout;

    private String upassword;

    private Integer uactived;

    private String uactiveCode;

    private String uemail;

    private String headUrl;

    private String ujoin_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUaccout() {
        return uaccout;
    }

    public void setUaccout(String uaccout) {
        this.uaccout = uaccout == null ? null : uaccout.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Integer getUactived() {
        return uactived;
    }

    public void setUactived(Integer uactived) {
        this.uactived = uactived;
    }

    public String getUactiveCode() {
        return uactiveCode;
    }

    public void setUactiveCode(String uactiveCode) {
        this.uactiveCode = uactiveCode == null ? null : uactiveCode.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    public String getUjoin_time() {
        return ujoin_time;
    }

    public void setUjoin_time(String ujoin_time) {
        this.ujoin_time = ujoin_time;
    }
}