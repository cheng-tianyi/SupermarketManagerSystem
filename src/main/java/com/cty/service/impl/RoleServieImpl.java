package com.cty.service.impl;

import com.cty.dao.RoleDao;
import com.cty.entity.Role;
import com.cty.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServieImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> selectAll() {
        return roleDao.selectByExample(null);
    }
}
