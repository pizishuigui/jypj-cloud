package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;
@Data
public class TeacherUpdateDto {
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "学科")
    private Set<String> subject;
    @ApiModelProperty(value = "班级")
    //暂定要不要改为主键索引？
    private Set<String> className;
}
