package com.cty.service;

import com.cty.entity.Bill;
import com.cty.entity.pojo.PageResult;

public interface BillService {
    PageResult findPage(Integer page, Integer pageSize, Bill bill);

    void add(Bill bill);

    void deleteBill(String billCode);

    void update(Bill bill);
}
