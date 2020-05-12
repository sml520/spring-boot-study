package com.sxb.service;

import com.sxb.vo.ArticleVO;

import java.util.List;

/**
 *
 * @author 张元亮
 * @date 2020/5/6
 */
public interface ArticleRestService {

    ArticleVO saveArticle(ArticleVO article);

    void deleteArticle(Long id);

    void updateArticle(ArticleVO article);

    ArticleVO getArticle(Long id);

    List<ArticleVO> getAll();
}
