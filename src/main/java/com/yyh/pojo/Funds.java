package com.yyh.pojo;

import java.util.Date;

public class Funds {
    private Integer id;

    private String fname;

    private Integer fcode;

    private Date fnetdate;

    private Double fanet;

    private Double fdhl;

    private Double fyearnings;

    private Double faincome;

    private String ftype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFcode() {
        return fcode;
    }

    public void setFcode(Integer fcode) {
        this.fcode = fcode;
    }

    public Date getFnetdate() {
        return fnetdate;
    }

    public void setFnetdate(Date fnetdate) {
        this.fnetdate = fnetdate;
    }

    public Double getFanet() {
        return fanet;
    }

    public void setFanet(Double fanet) {
        this.fanet = fanet;
    }

    public Double getFdhl() {
        return fdhl;
    }

    public void setFdhl(Double fdhl) {
        this.fdhl = fdhl;
    }

    public Double getFyearnings() {
        return fyearnings;
    }

    public void setFyearnings(Double fyearnings) {
        this.fyearnings = fyearnings;
    }

    public Double getFaincome() {
        return faincome;
    }

    public void setFaincome(Double faincome) {
        this.faincome = faincome;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }
}