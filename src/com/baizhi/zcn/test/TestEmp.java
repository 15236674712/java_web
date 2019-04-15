package com.baizhi.zcn.test;

import com.baizhi.zcn.dao.EmpDao;
import com.baizhi.zcn.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestEmp {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testqueryAll() {

        List<Emp> emps = empDao.queryAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }

    }

}
