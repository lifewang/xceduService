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

}
