package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudengUpdateDto {

    @ApiModelProperty(value = "姓名")
    private  String name;
    @ApiModelProperty(value = "学号")
    private  String code;
    @ApiModelProperty(value = "性别")
    private  String gender;
    @ApiModelProperty(value = "班级")
    private  String className;
}
