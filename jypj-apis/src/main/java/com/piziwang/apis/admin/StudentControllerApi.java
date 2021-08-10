package com.piziwang.apis.admin;


import com.piziwang.model.admin.dtos.ExcelImportRresponseDto;
import com.piziwang.model.admin.dtos.StudengUpdateDto;
import com.piziwang.model.admin.dtos.StudentQueryDto;
import com.piziwang.model.admin.pojo.AdStudent;
import com.piziwang.model.common.dtos.ResponseResult;
import org.springframework.web.multipart.MultipartFile;


public interface StudentControllerApi  {

    /**
     * 根据名称分页查询频道列表
     * @param studentQueryDto
     * @return
     */

    public ResponseResult findByNameAndPage(StudentQueryDto studentQueryDto);

    /**
     * 新增
     * @param adStudent
     * @return
     */
    public ResponseResult save(AdStudent adStudent);

    /**
     * 修改
     * @param studengUpdateDto
     * @return
     */
    public ResponseResult update(StudengUpdateDto studengUpdateDto);

    /**
     * 删除
     * @param id
     * @return
     */
    public ResponseResult deleteById(Integer id);

    /**
     * 批量导入学生名单
     * @param file
     * @return
     */
    public ExcelImportRresponseDto excelImport(MultipartFile file);
}
