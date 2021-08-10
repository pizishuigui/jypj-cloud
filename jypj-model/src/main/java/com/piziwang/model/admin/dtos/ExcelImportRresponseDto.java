package com.piziwang.model.admin.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashSet;

@Data
public class ExcelImportRresponseDto {
    @ApiModelProperty(value = "代码",required = true)
    private Integer code;
    @ApiModelProperty(value = "成功行数",required = true)
    private Integer successCount;
    @ApiModelProperty(value = "失败行数",required = true)
    private Integer errorCount;
    @ApiModelProperty(value = "错误具体内容",required = true)
    private HashSet errorDetail;
}
