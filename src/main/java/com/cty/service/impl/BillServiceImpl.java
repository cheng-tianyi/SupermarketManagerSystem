package com.cty.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cty.dao.BillDao;
import com.cty.entity.Bill;
import com.cty.entity.BillQuery;
import com.cty.entity.pojo.PageResult;
import com.cty.service.BillService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;
    @Override
    public PageResult findPage(Integer page, Integer pageSize, Bill bill) {

        IPage<Bill> ipage = new Page<>(page,pageSize);
        LambdaQueryWrapper<Bill> wrapper = new LambdaQueryWrapper<>();
        if(bill!=null) {
            wrapper.like(StringUtils.isNotEmpty(bill.getProductName()), Bill::getProductName, bill.getProductName());
            wrapper.eq(bill.getProviderId()!=null&&bill.getProviderId() != 0, Bill::getProviderId, bill.getProviderId());
            wrapper.eq(bill.getIsPayment()!=null&&bill.getIsPayment() != 0, Bill::getIsPayment, bill.getIsPayment());
        }
        IPage<Bill> providerIPage = billDao.selectPage(ipage, wrapper);
        PageResult result = new PageResult(providerIPage.getTotal(),providerIPage.getRecords());
        return result;

//        PageHelper.startPage(page,pageSize);
//        BillQuery query = new BillQuery();
//        BillQuery.Criteria criteria = query.createCriteria();
//        if(bill!=null){
//            if(bill.getProductName()!=null&&!"".equals(bill.getProductName())){
//                criteria.andProductNameLike("%"+bill.getProductName()+"%");
//            }
//            if(bill.getProviderId()!=null&&bill.getProviderId()!=0){
//                criteria.andProviderIdEqualTo(bill.getProviderId());
//            }
//            if(bill.getIsPayment()!=null&&bill.getIsPayment()!=0){
//                criteria.andIsPaymentEqualTo(bill.getIsPayment());
//            }
//        }
//        Page<Bill> billList =(Page<Bill>) billDao.selectByExample(query);
//        return new PageResult(billList.getTotal(),billList.getResult());
    }

    @Override
    public void add(Bill bill) {
        billDao.insertSelective(bill);
    }

    @Override
    public void deleteBill(String billCode) {
        BillQuery query = new BillQuery();
        BillQuery.Criteria criteria = query.createCriteria();
        criteria.andBillCodeEqualTo(billCode);
        billDao.deleteByExample(query);
    }

    @Override
    public void update(Bill bill) {
        billDao.updateById(bill);
    }
}
