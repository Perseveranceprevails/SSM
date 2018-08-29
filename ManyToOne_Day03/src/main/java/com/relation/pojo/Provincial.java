package com.relation.pojo;


import java.io.Serializable;

public class Provincial implements Serializable {

  private long pid;
  private String pname;
  private long countryid;

  private Country country;



  @Override
  public String toString() {
    return "Provincial{" +
            "pid=" + pid +
            ", pname='" + pname + '\'' +
            ", countryid=" + countryid +
            ", country=" + country +
            '}';
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public long getCountryid() {
    return countryid;
  }

  public void setCountryid(long countryid) {
    this.countryid = countryid;
  }

}
