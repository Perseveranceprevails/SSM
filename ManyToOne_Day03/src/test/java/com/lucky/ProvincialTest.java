package com.lucky;

import com.relation.util.SessionFactory;
import com.relation.dao.ProvincialMapper;
import com.relation.pojo.Provincial;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProvincialTest {

    SqlSession session=null;
    ProvincialMapper mapper=null;
    @Before
    public void befor(){
        session = SessionFactory.getFactory().openSession();
        mapper = session.getMapper(ProvincialMapper.class);
    }

    @After
    public void after(){
        session.commit();
        session.close();
    }

    @Test
    public void findProvincial(){
        Provincial provincial = mapper.findProvincial(3);
        System.out.println(provincial);

    }

}
