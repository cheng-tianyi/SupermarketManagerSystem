package com.cty.controller;

import com.cty.entity.Goods;

import com.cty.entity.pojo.GoodsDTO;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("findPage")
    public PageResult findPage(Integer page, Integer pageSize,@RequestBody Goods goods){
        PageResult userList = goodsService.findPage(page,pageSize,goods);
        return userList;
    }
    @RequestMapping("goodsAdd")
    public Result goodsAdd(@RequestBody GoodsDTO goodsDTO){
        try {
            goodsService.goodsAdd(goodsDTO);
            return new Result(true,"添加成功");
        }catch (Exception e){
            return new Result(false,"添加失败");
        }

    }
    @RequestMapping("update")
    public Result update(@RequestBody GoodsDTO goodsDTO){
        try {
            goodsService.update(goodsDTO);
            return new Result(true,"更新成功");
        }catch (Exception e){
            return new Result(false,"更新失败");
        }

    }

    @RequestMapping("deleteGoods")
    public Result deleteGoods(Long id){
        try {
            goodsService.deleteGoodsById(id);
            return new Result(true,"删除成功");
        }catch (Exception e){
            return new Result(false,"删除失败");
        }

    }
    @RequestMapping("saveSession")
    public void saveSession(@RequestBody GoodsDTO goodsDTO, HttpSession session){
        session.setAttribute("modifyGoods",goodsDTO);
    }
    @RequestMapping("getSessionGoods")
    public GoodsDTO getSessionGoods(HttpSession session){
        GoodsDTO goodsDTO = (GoodsDTO)session.getAttribute("modifyGoods");
        return goodsDTO;
    }
}
