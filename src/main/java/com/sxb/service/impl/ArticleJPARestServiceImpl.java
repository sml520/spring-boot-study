package com.sxb.service.impl;

import com.sxb.model.Article2;
import com.sxb.repository.ArticleRepository;
import com.sxb.service.ArticleRestService;
import com.sxb.vo.ArticleVO;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author 张元亮
 * @date 2020/5/6
 */
@Service
public class ArticleJPARestServiceImpl implements ArticleRestService {

    /**
     * 将JPA仓库对象注入
     */
    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private Mapper dozerMapper;

    @Override
    public ArticleVO saveArticle(ArticleVO article) {
        Article2 articlePO = dozerMapper.map(article, Article2.class);
        articleRepository.save(articlePO);
        return article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void updateArticle(ArticleVO article) {
        Article2 articlePO = dozerMapper.map(article, Article2.class);
        articleRepository.save(articlePO);
    }

    @Override
    public ArticleVO getArticle(Long id) {
        return null;
    }

    @Override
    public List<ArticleVO> getAll() {
        return null;
    }

}
