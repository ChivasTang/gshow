package com.gshow.controller;

import com.gshow.domain.entity.scott.EmpEntity;
import com.gshow.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    @ResponseBody
    public List<EmpEntity> getEmpList() {
        return empService.getEmpList();
    }
}
