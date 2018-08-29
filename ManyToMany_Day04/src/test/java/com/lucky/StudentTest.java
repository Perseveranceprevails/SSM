package com.lucky;

import com.relation.dao.StudentMapper;
import com.relation.pojo.Student;
import com.relation.pojo.Teacher;
import com.relation.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {


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
    public void findStudentBySid(){
        Student studentBySid = mapper.findStudentBySid(3);
        System.out.println(studentBySid);
    }

    @Test
    public void findTeacherByTid(){
        Teacher teacherBySid = mapper.findTeacherBySid(3);
        System.out.println(teacherBySid);

    }

}
