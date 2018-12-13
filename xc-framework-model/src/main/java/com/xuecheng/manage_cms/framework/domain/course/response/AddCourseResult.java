package com.xuecheng.manage_cms.framework.domain.course.response;

import com.xuecheng.manage_cms.framework.model.response.ResponseResult;
import com.xuecheng.manage_cms.framework.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/3/20.
 */
@Data
@ToString
public class AddCourseResult extends ResponseResult {
    public AddCourseResult(ResultCode resultCode, String courseid) {
        super(resultCode);
        this.courseid = courseid;
    }
    private String courseid;

}
