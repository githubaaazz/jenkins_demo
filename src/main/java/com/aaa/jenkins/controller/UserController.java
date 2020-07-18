package com.aaa.jenkins.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fileName:UserController
 * description:
 * author:zz
 * createTime:2020/6/12 12:27
 * version:1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户列表
     * @return
     */
    @RequestMapping("list")
    public String list(Model model){

        List<Map> userMapList = new ArrayList<>();
        Map map = new HashMap();
        map.put("userId",1001);
        map.put("userName","zhangsan");
        userMapList.add(map);
        Map map1 = new HashMap();
        map1.put("userId",1002);
        map1.put("userName","zhangsan1");
        userMapList.add(map1);
        Map map2 = new HashMap();
        map2.put("userId",1003);
        map2.put("userName","zhangsan2");
        userMapList.add(map2);
        model.addAttribute("userMapList",userMapList);
        return "list";
    }
}
