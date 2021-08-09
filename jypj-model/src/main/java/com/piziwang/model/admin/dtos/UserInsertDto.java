package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserInsertDto {
    /**
     * 登录用户名
     */
    @ApiModelProperty(value="用户名",required = true)
    private String username;

    /**
     * 登录密码
     */
    @ApiModelProperty(value="密码",required = true)
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty(value="手机号",required = true)
    private String phone;

}
