package com.cty.controller;

import com.cty.entity.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnHtml {
    @RequestMapping("/useradd")
    public String useradd(){
        return "useradd";
    }
    @RequestMapping("/userList")
    public String userList(){
        return "userList";
    }
    @RequestMapping("/userModify")
    public String userModify(){
        return "userModify";
    }
    @RequestMapping("/userView")
    public String userView(){
        return "userView";
    }
    @RequestMapping("/providerlist")
    public String providerlist() {
        return "provider/providerlist";
    }
    @RequestMapping("/providerAdd")
    public String providerAdd() {
        return "provider/providerAdd";
    }
    @RequestMapping("/providerModify")
    public String providerModify() {
        return "provider/providerModify";
    }
    @RequestMapping("/providerView")
    public String providerView() {
        return "provider/providerView";
    }
    @RequestMapping("/billlist")
    public String billlist() {
        return "bill/billlist";
    }
    @RequestMapping("/billadd")
    public String billadd() {
        return "bill/billadd";
    }
    @RequestMapping("/billModify")
    public String billModify() {
        return "bill/billModify";
    }
    @RequestMapping("/billView")
    public String billView() {
        return "bill/billView";
    }
    @RequestMapping("/pwdModify")
    public String pwdModify() {
        return "pwdModify";
    }
    @RequestMapping("/goodslist")
    public String goodslist() {
        return "goods/goodsList";
    }
    @RequestMapping("/goodsadd")
    public String goodsadd() {
        return "goods/goodsadd";
    }
    @RequestMapping("/goodsModify")
    public String goodsModify() {
        return "goods/goodsModify";
    }
    @RequestMapping("/memberList")
    public String memberList() {
        return "member/memberList";
    }
    @RequestMapping("/memberadd")
    public String memberadd() {
        return "member/memberadd";
    }
    @RequestMapping("/memberModify")
    public String memberModify() {
        return "member/memberModify";
    }
    @RequestMapping("/sale")
    public String sale() {
        return "sale";
    }

}
