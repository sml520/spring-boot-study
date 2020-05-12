package com.sxb.controller;

import com.sxb.bean.AjaxResponse;
import com.sxb.bean.Article;
import com.sxb.service.ArticleService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 张元亮
 * @date 2020/4/3
 */
@Slf4j
@RestController
@RequestMapping("/article")
@Data
@ConfigurationProperties(prefix = "server")
public class ArticleController {
    /**
     *  使用@Value获取配置值
     */
//    @Value("${server.port}")
    private String port;

    @Resource
    private ArticleService articleService;

    /**
     * 获取一篇Article，使用GET方法
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {
        // 使用lombok提供的builder构建对象
        Article article1 = Article.builder()
                .id(1L)
                .author("zyl")
                .content("spring boot 2.深入浅出")
                .createTime(new Date())
                .title("spring boot").build();
        System.out.println("============"+this.port);
        return AjaxResponse.success(article1);
    }


    @RequestMapping(value = "/save")
    public AjaxResponse save() {
        // 使用lombok提供的builder构建对象
        Article article = Article.builder()
                .id(1L)
                .author("zyl")
                .content("spring boot 2.深入浅出")
                .createTime(new Date())
                .title("spring boot").build();
        articleService.save(article);

        return AjaxResponse.success();
    }

    @RequestMapping(value = "/save2")
    public AjaxResponse save2() {
        com.sxb.model.Article article = new com.sxb.model.Article();
        article.setId(3);
        article.setAuthor("王五");
        article.setContent("Spring Cloud");
        article.setCreateTime(new Date());
        article.setTitle("cloud");
        articleService.save2(article);

        return AjaxResponse.success();
    }
}
