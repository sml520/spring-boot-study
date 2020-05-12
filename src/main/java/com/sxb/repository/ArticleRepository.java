package com.sxb.repository;

import com.sxb.model.Article2;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 张元亮
 * @date 2020/5/6
 */
public interface ArticleRepository extends JpaRepository<Article2, Long>{

    Article2 findByAuthor(String author);

}
