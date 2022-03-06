package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.text.html.parser.Entity;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")   //createArticle()의 파라미터에 dto의 ArticleForm을 입력
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        // 1. DTO를 변환 :Entity
        Article article = form.toEntity();
        // 2. Repository가 Entity를 DB에 저장함 
        return "";
    }
}
