package com.relation.pojo;


import java.io.Serializable;

public class Country implements Serializable {

  private long cid;
  private String cname;

  @Override
  public String toString() {
    return "Country{" +
            "cid=" + cid +
            ", cname='" + cname + '\'' +
            '}';
  }

  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }



}
