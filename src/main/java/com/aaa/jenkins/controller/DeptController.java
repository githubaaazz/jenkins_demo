package com.aaa.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * fileName:DeptController
 * description:
 * author:zz
 * createTime:2020/7/18 11:36
 * version:1.0.0
 */
@Controller
@RequestMapping("dept")
public class DeptController {

    /**
     * 模拟部门列表
     * @return
     */
    @RequestMapping("list")
    public Object listDept(Model model){
        List<Map> mapList =new ArrayList<>();
        Map map1 =new HashMap();
        map1.put("deptNo",10);
        map1.put("dname","accounting");
        map1.put("loc","beijing");
        mapList.add(map1);
        Map map2 =new HashMap();
        map2.put("deptNo",20);
        map2.put("dname","sales");
        map2.put("loc","shanghai");
        mapList.add(map2);
        model.addAttribute("deptList",mapList);
        return "deptlist";
    }
}
