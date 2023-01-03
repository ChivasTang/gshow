package com.gshow.service;

import com.gshow.domain.entity.scott.EmpEntity;
import com.gshow.mapper.scott.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<EmpEntity> getEmpList() {
        return empMapper.selectAll();
    }
}
