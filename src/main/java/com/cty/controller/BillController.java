package com.cty.controller;

import com.cty.entity.Bill;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("bill")
public class BillController {
    @Autowired
    private BillService billService;
    @RequestMapping("findPage")
    public PageResult findPage(Integer page, Integer pageSize, @RequestBody Bill bill){
        PageResult result = billService.findPage(page,pageSize,bill);
        return result;
    }
    @RequestMapping("billAdd")
    public Result billAdd(@RequestBody Bill bill){
        bill.setCreationDate(new Date());
        try {
            billService.add(bill);
            return new Result(true,"添加成功");
        }catch (Exception e){
            return new Result(false,"添加失败");
        }
    }
    @RequestMapping("update")
    public Result update(@RequestBody Bill bill){
        bill.setModifyDate(new Date());
        try {
            billService.update(bill);
            return new Result(true,"修改成功");
        }catch (Exception e){
            return new Result(false,"修改失败");
        }
    }
    @RequestMapping("deleteBill")
    public Result deleteBill(String billCode){
        try {
            billService.deleteBill(billCode);
            return new Result(true,"删除成功");
        }catch (Exception e){
            return new Result(false,"删除失败");
        }
    }
    @RequestMapping("saveData")
    public void showData(@RequestBody Bill bill, HttpSession session){
        session.setAttribute("billShow",bill);
    }
    @RequestMapping("getData")
    public Bill getData(HttpSession session){
        Bill bill = (Bill)session.getAttribute("billShow");
        return bill;
    }
}
