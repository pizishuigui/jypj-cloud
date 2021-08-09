package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherQueryDto {
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "班级名称")
    private String className;
}
