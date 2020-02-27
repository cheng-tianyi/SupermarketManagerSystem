package com.cty.controller;

import com.cty.entity.Role;
import com.cty.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("findAll")
    public List<Role> findAll(){
        List<Role> roleList = roleService.selectAll();
        return roleList;
    }
}
