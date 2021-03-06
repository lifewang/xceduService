package com.xuecheng.manage_cms.framework.domain.media.request;

import com.xuecheng.manage_cms.framework.model.request.RequestData;
import lombok.Data;

@Data
public class QueryMediaFileRequest extends RequestData {

    private String fileOriginalName;
    private String processStatus;
    private String tag;
}
