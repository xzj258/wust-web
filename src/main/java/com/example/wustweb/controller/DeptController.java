package com.example.wustweb.controller;

import com.example.wustweb.pojo.Dept;
import com.example.wustweb.pojo.Result;
import com.example.wustweb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门管理控制器
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @GetMapping("/depts")
    public Result list() {
        List<Dept> list = deptService.findAll();
        return Result.success(list);
    }
}