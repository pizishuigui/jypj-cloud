package com.piziwang.model.admin.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Set;

@Data
public class AdTeacher {
    @ApiModelProperty(value = "姓名",required = true)
    private String name;
    @ApiModelProperty(value = "学科",required = true)
    private Set<String> subject;
    @ApiModelProperty(value = "班级",required = true)
    //暂定要不要改为主键索引？
    private Set<String> className;

}
