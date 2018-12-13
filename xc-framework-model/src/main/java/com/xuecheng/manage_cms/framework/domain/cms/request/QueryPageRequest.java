package com.xuecheng.manage_cms.framework.domain.cms.request;

import lombok.Data;

/**
 * @author Mang
 * @version 1.0
 * @create 2018-12-11
 */
@Data
public class QueryPageRequest {
    //接收页面查询的条件
    //站点id
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;
}
