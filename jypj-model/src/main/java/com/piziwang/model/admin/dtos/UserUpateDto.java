package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class UserUpateDto {
    /**
     * 登录用户名
     */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 登录密码
     */
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty(value="手机号")
    private String phone;

    /**
     * 状态
     0 暂时不可用
     1 永久不可用
     9 正常可用
     */
    @ApiModelProperty(value="状态")
    private Integer status;

}
