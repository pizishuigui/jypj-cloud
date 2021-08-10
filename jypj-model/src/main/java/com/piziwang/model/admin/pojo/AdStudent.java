package com.piziwang.model.admin.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AdStudent {

    private Integer id;

    private  String name;

    private  String code;

    private  String gender;

    private  Integer classCode;
}
