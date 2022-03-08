// dto : 데이터 받을 그릇
package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {

    private String title;
    private String content;

//    리팩토링 : @AllArgsConstructor
//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }


//      리팩토링 : @ToString
    // title와 content을 확인하기 위한 toString
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
