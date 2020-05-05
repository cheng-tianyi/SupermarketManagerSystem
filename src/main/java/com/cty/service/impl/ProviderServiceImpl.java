package com.cty.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cty.dao.ProviderDao;
import com.cty.entity.Provider;
import com.cty.entity.ProviderQuery;
import com.cty.entity.pojo.PageResult;
import com.cty.service.ProviderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;

    @Override
    public PageResult findPage(Integer page, Integer pageSize, Provider provider) {
        IPage<Provider> ipage = new Page<>(page,pageSize);
        LambdaQueryWrapper<Provider> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(StringUtils.isNotEmpty(provider.getProName()),Provider::getProName,provider.getProName());
        wrapper.like(StringUtils.isNotEmpty(provider.getProCode()),Provider::getProCode,provider.getProCode());
        IPage<Provider> providerIPage = providerDao.selectPage(ipage, wrapper);
//        ProviderQuery query = new ProviderQuery();
////        ProviderQuery.Criteria criteria = query.createCriteria();
////        if (provider!=null){
////            if (provider.getProName()!=null&&!"".equals(provider.getProName())){
////                criteria.andProNameLike("%"+provider.getProName()+"%");
////            }
////            if (provider.   getProCode()!=null&&!"".equals(provider.getProCode())){
////                criteria.andProCodeLike("%"+provider.getProCode()+"%");
////            }
////        }
//        List<Provider> providers = providerDao.selectByExample(query);
        PageResult result = new PageResult(providerIPage.getTotal(),providerIPage.getRecords());
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
        providerDao.updateById(provider);
    }

    @Override
    public List<Provider> findAll() {
        return providerDao.selectByExample(null);
    }
}
