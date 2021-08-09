package com.piziwang.admin.controller;

import com.piziwang.admin.service.UserService;
import com.piziwang.apis.admin.UserControllerApi;
import com.piziwang.model.admin.dtos.UserInsertDto;
import com.piziwang.model.admin.dtos.UserQueryDto;
import com.piziwang.model.admin.dtos.UserUpateDto;
import com.piziwang.model.admin.pojo.AdUser;
import com.piziwang.model.common.dtos.ResponseResult;
import com.piziwang.model.common.enums.AppHttpCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员页面
 */
@Api(tags = "用户模块")
@RestController
@RequestMapping("/adUser")
public class AdUserController implements UserControllerApi {
    @Autowired
    UserService userService;

    @Override
    @ApiOperation(value = "查询用户列表")
    @PostMapping(value = "/list")
    public ResponseResult findByNameAndPage(UserQueryDto userQueryDto) {
        return userService.findByNameAndPage(userQueryDto);
    }

    @Override
    @ApiOperation(value = "新增用户")
    @PostMapping("/insert")
    public ResponseResult save(UserInsertDto UserDto) {
        return null;
    }

    @Override
    @ApiOperation(value = "修改用户")
    @PostMapping("/update")
    public ResponseResult update(UserUpateDto UserDto) {
        return null;
    }

    @Override
    @ApiOperation(value = "删除用户")
    @GetMapping("/deleteById")
    public ResponseResult deleteById(Integer id) {
        return null;
    }
}
