package com.piziwang.model.admin.dtos;

import com.piziwang.model.common.dtos.PageRequestDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentQueryDto extends PageRequestDto {
    @ApiModelProperty(value = "学生姓名", required = true)
    private String name;
}

