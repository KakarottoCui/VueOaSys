package com.zjw.oa.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Qjsq {

  private long qjId;
  private String qjyy;
  private String qjms;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date ksTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date jsTime;
  private String qjzt;
  private int userId;
  private String userName;


  public long getQjId() {
    return qjId;
  }

  public void setQjId(long qjId) {
    this.qjId = qjId;
  }


  public String getQjyy() {
    return qjyy;
  }

  public void setQjyy(String qjyy) {
    this.qjyy = qjyy;
  }


  public String getQjms() {
    return qjms;
  }

  public void setQjms(String qjms) {
    this.qjms = qjms;
  }


  public Date getKsTime() {
    return ksTime;
  }

  public void setKsTime(Date ksTime) {
    this.ksTime = ksTime;
  }


  public Date getJsTime() {
    return jsTime;
  }

  public void setJsTime(Date jsTime) {
    this.jsTime = jsTime;
  }


  public String getQjzt() {
    return qjzt;
  }

  public void setQjzt(String qjzt) {
    this.qjzt = qjzt;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
