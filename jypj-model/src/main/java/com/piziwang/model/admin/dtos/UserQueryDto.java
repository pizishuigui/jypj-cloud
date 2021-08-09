package com.piziwang.model.admin.dtos;

import com.piziwang.model.common.dtos.PageRequestDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserQueryDto extends PageRequestDto {

    //用户名
    @ApiModelProperty(value = "姓名")
    private String name;


}
