package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.text.html.parser.Entity;

@Controller
@Slf4j  // 로깅을 위한 어노테이션
public class ArticleController {

    // 객체 주입하기 DI
    @Autowired  // 스프링부트가 미리 생성해 놓은 객체를 가져다가 자동 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")   //createArticle()의 파라미터에 dto의 ArticleForm을 입력
    public String createArticle(ArticleForm form) {
        log.info(form.toString());  // 아래의 println 대체
//      System.out.println(form.toString()); --> 로깅 기능으로 대체
        // 1. DTO를 변환 :Entity
        Article article = form.toEntity();
        log.info(article.toString());
//        System.out.println(article.toString());
        // 2. Repository가 Entity를 DB에 저장함
        Article saved = articleRepository.save(article);  //위에서 Entity로 만들어진 article를 save
        log.info(saved.toString());
//        System.out.println(saved.toString());

        return "";
    }
}
