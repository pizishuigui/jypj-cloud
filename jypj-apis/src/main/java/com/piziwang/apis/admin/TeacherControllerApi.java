package com.piziwang.apis.admin;

import com.piziwang.model.admin.dtos.ExcelImportRresponseDto;
import com.piziwang.model.admin.dtos.TeacherInsertDto;
import com.piziwang.model.admin.dtos.TeacherQueryDto;
import com.piziwang.model.admin.dtos.TeacherUpdateDto;
import com.piziwang.model.common.dtos.ResponseResult;
import org.springframework.web.multipart.MultipartFile;


public interface TeacherControllerApi {

    /**
     * 根据名称分页查询频道列表
     * @param teacherQueryDto
     * @return
     */

    public ResponseResult findByNameAndPage(TeacherQueryDto teacherQueryDto);

    /**
     * 新增
     * @param teacherInsertDto
     * @return
     */
    public ResponseResult save(TeacherInsertDto teacherInsertDto);

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


    public ExcelImportRresponseDto excelImport(MultipartFile file);

}
