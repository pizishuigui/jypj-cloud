package com.piziwang.admin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.piziwang.admin.mapper.AdUserMapper;
import com.piziwang.admin.service.UserService;
import com.piziwang.model.admin.dtos.UserQueryDto;
import com.piziwang.model.admin.pojo.AdUser;
import com.piziwang.model.common.dtos.PageResponseResult;
import com.piziwang.model.common.dtos.ResponseResult;
import com.piziwang.model.common.enums.AppHttpCodeEnum;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<AdUserMapper, AdUser> implements UserService {
    @Override
    public ResponseResult findByNameAndPage(UserQueryDto userQueryDto) {
        //1.参数检测
        if(userQueryDto==null){
            return ResponseResult.errorResult(AppHttpCodeEnum.PARAM_INVALID);
        }
        //分页参数检查
        userQueryDto.checkParam();

        //2.安装名称模糊分页查询
        Page page = new Page(userQueryDto.getPage(),userQueryDto.getSize());
        LambdaQueryWrapper<AdUser> lambdaQueryWrapper = new LambdaQueryWrapper();
        if(StringUtils.isNotBlank(userQueryDto.getName())){
            lambdaQueryWrapper.like(AdUser::getUsername,userQueryDto.getName());
        }
        IPage result = page(page, lambdaQueryWrapper);

        //3.结果封装
        ResponseResult responseResult = new PageResponseResult(userQueryDto.getPage(),userQueryDto.getSize(),(int)result.getTotal());
        responseResult.setData(result.getRecords());
        return responseResult;
    }
}
