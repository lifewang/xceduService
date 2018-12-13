package com.xuecheng.manage_cms.api.cms;

import com.xuecheng.manage_cms.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.manage_cms.framework.model.response.QueryResponseResult;

/**
 * Created by art on 2018/12/11
 */
public interface CmsPageControllerApi {
    //页面查询
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
