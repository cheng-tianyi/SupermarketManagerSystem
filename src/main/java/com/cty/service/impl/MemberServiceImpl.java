package com.cty.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cty.dao.GoodsDao;
import com.cty.dao.InventoryDao;
import com.cty.dao.MemberDao;
import com.cty.entity.Goods;
import com.cty.entity.Inventory;
import com.cty.entity.Member;
import com.cty.entity.pojo.GoodsDTO;
import com.cty.entity.pojo.PageResult;
import com.cty.service.MemberService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author wuyong7
 * @Description
 * @data 2020/5/5 14:25
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public PageResult findPage(Integer page, Integer pageSize, Member member) {
        IPage<Member> page1 = new Page<>(page,pageSize);
        LambdaQueryWrapper<Member> wrapper = new LambdaQueryWrapper<>();
        if(member!=null) {
            wrapper.like(StringUtils.isNotEmpty(member.getName()), Member::getName, member.getName());
            wrapper.eq(StringUtils.isNotEmpty(member.getPhone()),Member::getPhone, member.getPhone());
        }
        IPage<Member> iPage = memberDao.selectPage(page1, wrapper);
        PageResult result = new PageResult(iPage.getTotal(),iPage.getRecords());
        return result;
    }

    @Override
    public void memberAdd(Member member) {
        memberDao.insert(member);
    }

    @Override
    public void update(Member member) {
        memberDao.updateByPrimaryKey(member);
    }

    @Override
    public void deleteMemberById(Long id) {
        memberDao.deleteById(id);
    }
}
