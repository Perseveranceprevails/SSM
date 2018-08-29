package com.lucky;

import com.lucky.dao.UserMapper;
import com.lucky.pojo.Country;
import com.lucky.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountryTest {

    SqlSession session=null;
    UserMapper mapper=null;
    @Before
    public void befor(){
        session = MyBatisUtil.getFactory().openSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void after(){
        session.commit();
        session.close();
    }


    @Test
    public void findCountryByIdTest(){
        Country countryById = mapper.findCountryById(1);
        System.out.println(countryById+"***");
    }

    @Test
    public void findCountryByIdTest_lazy(){
        Country countryById = mapper.findCountryById(1);
        System.out.println(countryById.getCname()+"***");
    }



}
