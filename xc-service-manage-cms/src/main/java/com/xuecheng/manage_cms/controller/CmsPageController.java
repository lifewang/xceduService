package com.xuecheng.manage_cms.controller;


import com.xuecheng.manage_cms.api.cms.CmsPageControllerApi;
import com.xuecheng.manage_cms.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.manage_cms.framework.model.response.CommonCode;
import com.xuecheng.manage_cms.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Mang
 * @version 1.0
 * @create 2018-12-11
 */

@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int
            size, QueryPageRequest queryPageRequest) {
        QueryResult<CmsPage> queryResult = new QueryResult<>();
        List<CmsPage> list = new ArrayList<>();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        queryResult.setTotal(1);
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;
    }
}
