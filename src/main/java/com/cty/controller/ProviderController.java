package com.cty.controller;

import com.cty.entity.Provider;
import com.cty.entity.pojo.PageResult;
import com.cty.entity.pojo.Result;
import com.cty.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;
    @RequestMapping("findPage")
    public PageResult findPage(Integer page, Integer pageSize, @RequestBody Provider provider){
        PageResult providerList = providerService.findPage(page,pageSize,provider);
        return providerList;
    }
    @RequestMapping("findAll")
    public List<Provider> findAll(){
        List<Provider> list = providerService.findAll();
        return list;
    }

    @RequestMapping("providerAdd")
    public Result userAdd(@RequestBody Provider provider){
        try {
            providerService.add(provider);
            return new Result(true,"添加成功");
        }catch (Exception e){
            return new Result(false,"添加失败");
        }

    }
    @RequestMapping("update")
    public Result update(@RequestBody Provider provider){
        try {
            providerService.update(provider);
            return new Result(true,"修改成功");
        }catch (Exception e){
            return new Result(false,"修改失败");
        }

    }
    @RequestMapping("providerdel")
    public Result providerdel(String proCode){
        try {
            providerService.delete(proCode);
            return new Result(true,"删除成功");
        }catch (Exception e){
            return new Result(false,"删除失败");
        }

    }
    @RequestMapping("saveData")
    public void showData(@RequestBody Provider provider, HttpSession session){
        session.setAttribute("providerShow",provider);
    }
    @RequestMapping("getData")
    public Provider getData(HttpSession session){
        Provider provider = (Provider)session.getAttribute("providerShow");
        return provider;
    }
}
