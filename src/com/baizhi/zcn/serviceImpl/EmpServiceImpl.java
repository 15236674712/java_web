package com.baizhi.zcn.serviceImpl;

import com.baizhi.zcn.dao.EmpDao;
import com.baizhi.zcn.entity.Emp;
import com.baizhi.zcn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> queryAll() {

        List<Emp> emps = empDao.queryAll();

        return emps;
    }

}
