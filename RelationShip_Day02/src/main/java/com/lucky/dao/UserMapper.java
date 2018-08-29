package com.lucky.dao;

import com.lucky.pojo.Country;

import java.io.Serializable;

public interface UserMapper {

    Country findCountryById(Serializable cid);

}
