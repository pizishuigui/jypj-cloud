/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.piziwang.achivements.controller;

import com.google.common.collect.Lists;
import com.piziwang.achivements.common.Rest;
import com.piziwang.achivements.model.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 *
 * @since:swagger-bootstrap-ui 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2019/05/04 11:26
 */
@Api(tags = "绩效模块")
@RestController
@RequestMapping("/achievement")
public class AchievementController {


    @ApiOperation(value = "查询绩效列表")
    @PostMapping(value = "/list")
    public Rest<List<Order>> list(){
        Rest<List<Order>> rest=new Rest<>();
        List<Order> list= Lists.newArrayList(new Order(),new Order(),new Order(),new Order(),new Order(),new Order());
        rest.setData(list);
        return rest;
    }

    @ApiOperation(value = "根据老师id查询绩效详情")
    @GetMapping("/queryById")
    public Rest<Order> queryById(@RequestParam(value = "id") String id){
        Rest<Order> userRest=new Rest<>();
        userRest.setData(new Order());

        return userRest;
    }





}
