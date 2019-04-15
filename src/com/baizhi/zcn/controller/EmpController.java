


package com.baizhi.zcn.controller;

import com.baizhi.zcn.entity.Emp;
import com.baizhi.zcn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/emp")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("queryAll")
    public HashMap<String, Object> queryAll() {
        List<Emp> emps = empService.queryAll();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("success", emps);
        map.put("message", "200");
        return map;
    }

}
