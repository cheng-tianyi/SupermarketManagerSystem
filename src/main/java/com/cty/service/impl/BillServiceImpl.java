package com.cty.service.impl;

import com.cty.dao.BillDao;
import com.cty.entity.Bill;
import com.cty.entity.BillQuery;
import com.cty.entity.pojo.PageResult;
import com.cty.service.BillService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;
    @Override
    public PageResult findPage(Integer page, Integer pageSize, Bill bill) {
        PageHelper.startPage(page,pageSize);
        BillQuery query = new BillQuery();
        BillQuery.Criteria criteria = query.createCriteria();
        if(bill!=null){
            if(bill.getProductName()!=null&&!"".equals(bill.getProductName())){
                criteria.andProductNameLike("%"+bill.getProductName()+"%");
            }
            if(bill.getProviderId()!=null&&bill.getProviderId()!=0){
                criteria.andProviderIdEqualTo(bill.getProviderId());
            }
            if(bill.getIsPayment()!=null&&bill.getIsPayment()!=0){
                criteria.andIsPaymentEqualTo(bill.getIsPayment());
            }
        }
        Page<Bill> billList =(Page<Bill>) billDao.selectByExample(query);
        return new PageResult(billList.getTotal(),billList.getResult());
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
        billDao.updateByPrimaryKeySelective(bill);
    }
}
