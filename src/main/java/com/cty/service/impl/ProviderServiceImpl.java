package com.cty.service.impl;

import com.cty.dao.ProviderDao;
import com.cty.entity.Provider;
import com.cty.entity.ProviderQuery;
import com.cty.entity.pojo.PageResult;
import com.cty.service.ProviderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;

    @Override
    public PageResult findPage(Integer page, Integer pageSize, Provider provider) {
        PageHelper.startPage(page,pageSize);
        ProviderQuery query = new ProviderQuery();
        ProviderQuery.Criteria criteria = query.createCriteria();
        if (provider!=null){
            if (provider.getProName()!=null&&!"".equals(provider.getProName())){
                criteria.andProNameLike("%"+provider.getProName()+"%");
            }
            if (provider.getProCode()!=null&&!"".equals(provider.getProCode())){
                criteria.andProCodeLike("%"+provider.getProCode()+"%");
            }
        }
        Page<Provider> providers = (Page<Provider>)providerDao.selectByExample(query);
        PageResult result = new PageResult(providers.getTotal(),providers.getResult());
        return result;
    }

    @Override
    public void add(Provider provider) {
        providerDao.insertSelective(provider);
    }

    @Override
    public void delete(String proCode) {
        ProviderQuery query = new ProviderQuery();
        ProviderQuery.Criteria criteria = query.createCriteria();
        criteria.andProCodeEqualTo(proCode);
        providerDao.deleteByExample(query);
    }

    @Override
    public void update(Provider provider) {
        providerDao.updateByPrimaryKeySelective(provider);
    }

    @Override
    public List<Provider> findAll() {
        return providerDao.selectAll();
    }
}
