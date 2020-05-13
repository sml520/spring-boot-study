package com.sxb.service.impl;

import com.sxb.bean.Article;
import com.sxb.dao.ArticleJdbcDao;
import com.sxb.dao.ArticleMapper;
import com.sxb.service.ArticleService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author 张元亮
 * @date 2020/4/30
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleJdbcDao articleJdbcDao;

    @Resource
    private ArticleMapper articleMapper;

    @Override
    @Async("taskExecutor")
    public void save(Article article) {
        articleJdbcDao.save(article);
        System.out.println("保存成功!");
    }

    @Override
    public void save2(com.sxb.model.Article article) {
        articleMapper.insert(article);
    }
}
