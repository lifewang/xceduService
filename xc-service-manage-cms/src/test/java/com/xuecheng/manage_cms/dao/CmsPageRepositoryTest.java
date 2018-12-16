package com.xuecheng.manage_cms.dao;

import com.xuecheng.manage_cms.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    /**
     * 查询所有数据
     */
    @Test
    public void testFindAll(){
        List<CmsPage> list = cmsPageRepository.findAll();
        System.out.println(list);
    }

    /**
     * 分页查询数据
     */
    @Test
    public void testFindPage(){
        int page=0;//从0开始
        int size = 10;
        Pageable pageable = PageRequest.of(page,size);
        Page<CmsPage> list = cmsPageRepository.findAll(pageable);
        System.out.println(list );
    }

    /**
     * 修改数据
     */
    @Test
    public void testUpdate(){
        Optional<CmsPage> optional = cmsPageRepository.findById("5ad94b9168db5243ec846e8e");
        if(optional.isPresent()){
            CmsPage cmsPage = optional.get();
            //设置需要修改的值
            cmsPage.setPageAliase("课程预览页面测试");
            //修改
            CmsPage save = cmsPageRepository.save(cmsPage);
            System.out.println(save);
        }
    }

}
