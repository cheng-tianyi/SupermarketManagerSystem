package com.cty.controller;

import com.cty.entity.Goods;
import com.cty.entity.Member;
import com.cty.entity.pojo.GoodsDTO;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.GoodsService;
import com.cty.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("findPage")
    public PageResult findPage(Integer page, Integer pageSize,@RequestBody Member member){
        PageResult memberList = memberService.findPage(page,pageSize,member);
        return memberList;
    }
    @RequestMapping("memberAdd")
    public Result memberAdd(@RequestBody Member member){
        try {
            memberService.memberAdd(member);
            return new Result(true,"添加成功");
        }catch (Exception e){
            return new Result(false,"添加失败");
        }

    }
    @RequestMapping("update")
    public Result update(@RequestBody Member member){
        try {
            memberService.update(member);
            return new Result(true,"更新成功");
        }catch (Exception e){
            return new Result(false,"更新失败");
        }

    }

    @RequestMapping("deleteMember")
    public Result deleteMember(Long id){
        try {
            memberService.deleteMemberById(id);
            return new Result(true,"删除成功");
        }catch (Exception e){
            return new Result(false,"删除失败");
        }

    }
    @RequestMapping("saveSession")
    public void saveSession(@RequestBody Member member, HttpSession session){
        session.setAttribute("modifyMember",member);
    }
    @RequestMapping("getSessionMember")
    public Member getSessionMember(HttpSession session){
        Member member = (Member)session.getAttribute("modifyMember");
        return member;
    }
}
