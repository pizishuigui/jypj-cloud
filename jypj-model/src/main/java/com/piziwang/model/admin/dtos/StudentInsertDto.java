package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentInsertDto {
    @ApiModelProperty(value = "学生姓名",required = true)
    private  String name;
    @ApiModelProperty(value = "学生学号",required = true)
    private  String code;
    @ApiModelProperty(value = "学生性别",required = true)
    private  String gender;
    @ApiModelProperty(value = "学生班级",required = true)
    private  Integer classCode;
}
