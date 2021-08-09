package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ClassUpdateDto {

    @ApiModelProperty(value = "班级名称")
    private String name;
    @ApiModelProperty(value = "文理选科：-1未分科，0文，1理")
    private  Integer asChoose;
    @ApiModelProperty(value = "**级：例2021")
    private String beginYear;
    @ApiModelProperty(value = "年级")
    private Integer grade;



}
