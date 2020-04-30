package com.sxb.dao;

import com.sxb.bean.Article;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 *
 * @author 张元亮
 * @date 2020/4/30
 */
@Repository
public class ArticleJdbcDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public void save(Article article) {
        //jdbcTemplate.update适合于insert 、update和delete操作；
        jdbcTemplate.update("INSERT INTO article(id, author, title,content,create_time) values(?, ?, ?, ?, ?)",
                article.getId(),
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getCreateTime());

    }
}
