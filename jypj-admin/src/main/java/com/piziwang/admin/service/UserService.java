package com.piziwang.admin.service;

import com.piziwang.model.admin.dtos.UserQueryDto;
import com.piziwang.model.common.dtos.ResponseResult;

public interface UserService {
    public ResponseResult findByNameAndPage(UserQueryDto userQueryDto);
}
