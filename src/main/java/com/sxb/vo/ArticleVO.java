package com.sxb.vo;


import lombok.Data;

import java.util.Date;

/**
 * @author 张元亮
 * @date 2020/5/6
 */
@Data
public class ArticleVO {

    private Long id;

    private String author;

    private String title;

    private String content;

    private Date createTime;
}
