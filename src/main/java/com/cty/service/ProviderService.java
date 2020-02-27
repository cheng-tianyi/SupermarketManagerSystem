package com.cty.service;

import com.cty.entity.Provider;
import com.cty.entity.pojo.PageResult;

import java.util.List;

public interface ProviderService {
    PageResult findPage(Integer page, Integer pageSize, Provider provider);

    /**
     * 添加
     * @param provider
     */
    void add(Provider provider);

    /**
     * 根据供应商编码删除
     * @param proCode 供应商编码
     */
    void delete(String proCode);

    /**
     * 修改
     * @param provider
     */
    void update(Provider provider);

    /**
     * 查询所有
     * @return
     */
    List<Provider> findAll();

}
