package com.cache;

import com.cache.dao.StudetnMapper;
import com.cache.pojo.Student;
import com.cache.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudetnTest {


    SqlSession session=null;
    StudetnMapper mapper=null;
    @Before
    public void befor(){
        session = SessionFactory.getFactory().openSession();
        mapper = session.getMapper(StudetnMapper.class);
    }

    @After
    public void after(){
        session.commit();
        session.close();
    }

    @Test
    public void findStudetnBySidTest(){
        Student studetnBySid = mapper.findStudetnBySid(1);//会产生一条Sql语句
        System.out.println(studetnBySid);

        System.out.println("=============================");

        int i = mapper.updateStudetnBySid(2);
        session.commit();

        System.out.println("=============================");
        
        Student studetnBySid1 = mapper.findStudetnBySid(1);//不会产生Sql语句
        System.out.println(studetnBySid1);
    }

}
