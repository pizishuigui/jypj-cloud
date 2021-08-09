package com.piziwang.apis.admin;


import com.piziwang.model.admin.dtos.ClassQueryDto;
import com.piziwang.model.admin.dtos.ClassUpdateDto;
import com.piziwang.model.admin.pojo.AdClass;
import com.piziwang.model.common.dtos.ResponseResult;


public interface ClassControllerApi {

    /**
     * 根据名称分页查询频道列表
     * @param classQueryDto
     * @return
     */

    public ResponseResult findByNameAndPage(ClassQueryDto classQueryDto);

    /**
     * 新增
     * @param adClass
     * @return
     */
    public ResponseResult save(AdClass adClass);

    /**
     * 修改
     * @param ClassUpdateDto
     * @return
     */
    public ResponseResult update(ClassUpdateDto ClassUpdateDto);

    /**
     * 删除
     * @param id
     * @return
     */
    public ResponseResult deleteById(Integer id);
}
