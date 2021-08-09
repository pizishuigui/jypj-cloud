package com.piziwang.apis.admin;

import com.piziwang.model.admin.dtos.TeacherDto;
import com.piziwang.model.admin.dtos.TeacherQueryDto;
import com.piziwang.model.admin.dtos.TeacherUpdateDto;
import com.piziwang.model.admin.pojo.AdTeacher;
import com.piziwang.model.common.dtos.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


public interface TeacherControllerApi {

    /**
     * 根据名称分页查询频道列表
     * @param teacherQueryDto
     * @return
     */

    public ResponseResult findByNameAndPage(TeacherQueryDto teacherQueryDto);

    /**
     * 新增
     * @param adTeacher
     * @return
     */
    public ResponseResult save(AdTeacher adTeacher);

    /**
     * 修改
     * @param teacherUpdateDto
     * @return
     */
    public ResponseResult update(TeacherUpdateDto teacherUpdateDto);

    /**
     * 删除
     * @param id
     * @return
     */
    public ResponseResult deleteById(Integer id);
}
