package com.piziwang.model.admin.dtos;

import com.piziwang.model.common.dtos.PageRequestDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ClassQueryDto extends PageRequestDto {

    @ApiModelProperty(value = "班级名称")
    private String name;


    @ApiModelProperty(value = "年级")
    private Integer grade;


}
