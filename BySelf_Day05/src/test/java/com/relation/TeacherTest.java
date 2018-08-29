package com.relation;

import com.relation.dao.TeacherMapper;
import com.relation.pojo.Teacher;
import com.relation.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TeacherTest {

    SqlSession session=null;
    TeacherMapper mapper=null;
    @Before
    public void befor(){
        session = SessionFactory.getFactory().openSession();
        mapper = session.getMapper(TeacherMapper.class);
    }

    @After
    public void after(){
        session.commit();
        session.close();
    }

    @Test
    public void findTeacherBytidTest(){
        List<Teacher> teacherBytid = mapper.findTeacherBytid(1);

        System.out.println(teacherBytid);
    }

}
