package com.xuecheng.manage_cms.dao;

import com.xuecheng.manage_cms.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
