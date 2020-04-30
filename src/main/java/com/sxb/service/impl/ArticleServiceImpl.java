package com.sxb.service.impl;

import com.sxb.bean.Article;
import com.sxb.dao.ArticleJdbcDao;
import com.sxb.service.ArticleService;
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

    @Override
    public void save(Article article) {
        articleJdbcDao.save(article);
        System.out.println("保存成功!");
    }
}
