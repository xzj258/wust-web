package com.example.wustweb.service;

import com.example.wustweb.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     */
    public List<Dept> findAll();
}