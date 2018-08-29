package com.lucky.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class MyBatisUtil {

    private static SqlSessionFactory factory;

    private MyBatisUtil(){}

    public static synchronized SqlSessionFactory getFactory(){
        String path="mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            if(factory==null){
                factory = new SqlSessionFactoryBuilder().build(is);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return factory;
    }

}
