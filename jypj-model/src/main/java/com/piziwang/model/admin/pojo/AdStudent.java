package com.piziwang.model.admin.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AdStudent {
    @ApiModelProperty(value = "学生主键")
    private Integer id;
    @ApiModelProperty(value = "学生姓名",required = true)
    private  String name;
    @ApiModelProperty(value = "学生学号",required = true)
    private  String code;
    @ApiModelProperty(value = "学生性别",required = true)
    private  String gender;
    @ApiModelProperty(value = "学生班级",required = true)
    private  Integer classCode;
}
