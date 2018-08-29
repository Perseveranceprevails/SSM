package com.page;

import com.github.pagehelper.PageHelper;
import com.page.dao.StudentMapper;
import com.page.pojo.Student;
import com.page.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudetnTest {


    SqlSession session=null;
    StudentMapper mapper=null;
    @Before
    public void befor(){
        session = SessionFactory.getFactory().openSession();
        mapper = session.getMapper(StudentMapper.class);
    }

    @After
    public void after(){
        session.commit();
        session.close();
    }


    @Test
    public void PageTest(){
        PageHelper.startPage(2,2);

        List<Student> studetnByPage = mapper.findStudetnByPage();
        System.out.println(studetnByPage);

    }


}
