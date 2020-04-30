package com.sxb.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 *
 * @author 张元亮
 * @date 2020/4/3
 */
@Data
@Builder
@JsonPropertyOrder(value={"content","title"})
public class Article {

    private Long id;

    private String author;

    private String title;

    private String content;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
