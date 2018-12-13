package com.xuecheng.manage_cms.framework.domain.media.response;

import com.xuecheng.manage_cms.framework.domain.media.MediaFile;
import com.xuecheng.manage_cms.framework.domain.media.MediaVideoCourse;
import com.xuecheng.manage_cms.framework.model.response.ResponseResult;
import com.xuecheng.manage_cms.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by admin on 2018/3/5.
 */
@Data
@ToString
@NoArgsConstructor
public class MediaCourseResult extends ResponseResult {
    public MediaCourseResult(ResultCode resultCode, MediaVideoCourse mediaVideoCourse) {
        super(resultCode);
        this.mediaVideoCourse = mediaVideoCourse;
    }

    MediaFile mediaVideo;
    MediaVideoCourse mediaVideoCourse;
}
