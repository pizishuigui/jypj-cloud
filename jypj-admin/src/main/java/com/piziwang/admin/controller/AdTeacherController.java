package com.piziwang.admin.controller;

import com.piziwang.apis.admin.TeacherControllerApi;
import com.piziwang.model.admin.dtos.ExcelImportRresponseDto;
import com.piziwang.model.admin.dtos.TeacherInsertDto;
import com.piziwang.model.admin.dtos.TeacherQueryDto;
import com.piziwang.model.admin.dtos.TeacherUpdateDto;
import com.piziwang.model.common.dtos.ResponseResult;
import com.piziwang.model.common.enums.AppHttpCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "老师管理模块")
@RestController
@RequestMapping("/teacher")
public class AdTeacherController implements TeacherControllerApi {
    @Override
    @ApiOperation("根据名称查询老师列表")
    @PostMapping("/list")
    public ResponseResult findByNameAndPage(TeacherQueryDto teacherQueryDto) {
        ResponseResult result = ResponseResult.errorResult(AppHttpCodeEnum.SUCCESS);
        return result;
    }

    @Override
    @ApiOperation("插入老师信息")
    @PostMapping("/insert")
    public ResponseResult save(TeacherInsertDto teacherInsertDto) {
        return null;
    }

    @Override
    @ApiOperation("修改老师信息")
    @PostMapping("/update")
    public ResponseResult update(TeacherUpdateDto teacherUpdateDto) {
        return null;
    }

    @Override
    @ApiOperation(value = "根据老师id删除数据")
    @GetMapping("/deleteById")
    public ResponseResult deleteById(Integer id) {
        return null;
    }

    @Override
    @ApiOperation("批量导入老师信息")
    @PostMapping("/excelImport")
    public ExcelImportRresponseDto excelImport(@RequestParam(value="excelFile")MultipartFile file) {
        return null;
    }
}
