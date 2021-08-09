package com.piziwang.apis.admin;

import com.piziwang.model.admin.dtos.UserInsertDto;
import com.piziwang.model.admin.dtos.UserQueryDto;
import com.piziwang.model.admin.dtos.UserUpateDto;
import com.piziwang.model.common.dtos.ResponseResult;
public interface UserControllerApi {

    /**
     * 根据名称分页查询频道列表
     * @param userQueryDto
     * @return
     */

    public ResponseResult findByNameAndPage(UserQueryDto userQueryDto);

    /**
     * 新增
     * @param userInsertDto
     * @return
     */
    public ResponseResult save(UserInsertDto userInsertDto);

    /**
     * 修改
     * @param userUpateDto
     * @return
     */
    public ResponseResult update(UserUpateDto userUpateDto);

    /**
     * 删除
     * @param id
     * @return
     */
    public ResponseResult deleteById(Integer id);
}
