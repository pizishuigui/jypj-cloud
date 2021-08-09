package com.piziwang.admin.controller;

import com.piziwang.apis.admin.ClassControllerApi;
import com.piziwang.model.admin.dtos.ClassQueryDto;
import com.piziwang.model.admin.dtos.ClassUpdateDto;
import com.piziwang.model.admin.pojo.AdClass;
import com.piziwang.model.admin.pojo.AdUser;
import com.piziwang.model.common.dtos.ResponseResult;
import com.piziwang.model.common.enums.AppHttpCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员页面
 */
@Api(tags = "班级模块")
@RestController
@RequestMapping("/adClass")
public class AdClassController implements ClassControllerApi {
    @Override

    @ApiOperation(value = "查询班级列表")
    @PostMapping(value = "/list")
    public ResponseResult findByNameAndPage(ClassQueryDto classQueryDto) {
        ResponseResult<AdUser> responseResult = new ResponseResult<>();
        return ResponseResult.errorResult(AppHttpCodeEnum.DATA_EXIST);
    }

    @Override
    @ApiOperation(value = "新增班级")
    @PostMapping("/insert")
    public ResponseResult save(AdClass adClass) {
        return null;
    }

    @Override
    @ApiOperation(value = "修改班级")
    @PostMapping("/update")
    public ResponseResult update(ClassUpdateDto classUpdateDto) {
        return null;
    }

    @Override
    @ApiOperation(value = "删除班级")
    @GetMapping("/deleteById")
    public ResponseResult deleteById(Integer id) {
        return null;
    }
}
