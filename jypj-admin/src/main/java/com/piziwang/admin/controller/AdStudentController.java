package com.piziwang.admin.controller;

import com.piziwang.apis.admin.StudentControllerApi;
import com.piziwang.model.admin.dtos.StudengUpdateDto;
import com.piziwang.model.admin.dtos.StudentQueryDto;
import com.piziwang.model.admin.pojo.AdStudent;
import com.piziwang.model.common.dtos.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "学生管理模块")
@RestController
@RequestMapping("/student")
public class AdStudentController implements StudentControllerApi {
    @Override
    @ApiOperation(value = "根据名称查询学生分页列表")
    @PostMapping("/list")
    public ResponseResult findByNameAndPage(StudentQueryDto studentQueryDto) {
        return null;
    }

    @Override
    @ApiOperation("插入单条学生数据")
    @PostMapping("/insert")
    public ResponseResult save(AdStudent adStudent) {
        return null;
    }

    @Override
    @ApiOperation("修改学生数据")
    @PostMapping("/update")
    public ResponseResult update(StudengUpdateDto studengUpdateDto) {
        return null;
    }

    @Override
    @ApiOperation("根据id删除学生")
    @GetMapping("/deleteById")
    public ResponseResult deleteById(Integer id) {
        return null;
    }
}
