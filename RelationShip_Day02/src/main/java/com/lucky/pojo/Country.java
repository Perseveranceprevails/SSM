package com.lucky.pojo;


import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable {

  private long cid;
  private String cname;
  private Set<Provincial> provincialSet;

  @Override
  public String toString() {
    return "Country{" +
            "cid=" + cid +
            ", cname='" + cname + '\'' +
            ", provincialSet=" + provincialSet +
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

  public Set<Provincial> getProvincialSet() {
    return provincialSet;
  }

  public void setProvincialSet(Set<Provincial> provincialSet) {
    this.provincialSet = provincialSet;
  }

}
