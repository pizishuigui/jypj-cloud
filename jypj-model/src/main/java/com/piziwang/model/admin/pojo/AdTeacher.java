package com.piziwang.model.admin.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Set;

@Data
public class AdTeacher {

    private String name;

    private Set<String> subject;

    //暂定要不要改为主键索引？
    private Set<String> className;

}
