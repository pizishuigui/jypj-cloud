package com.piziwang.model.admin.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
public class AdClass {
    @ApiModelProperty(value = "ID主键")
    private Integer id;
    @ApiModelProperty(value = "班级名称",required = true )
    private String name;
    @ApiModelProperty(value = "文理选科：-1未分科，0文，1理",required = true)
    private  Integer asChoose;
    @ApiModelProperty(value = "**级：例2021",required = true)
    private String beginYear;
    @ApiModelProperty(value = "年级",required = true)
    private Integer grade;
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
