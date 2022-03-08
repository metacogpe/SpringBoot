package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity  // DB가 해당 객체를 인식 가능하게 됨
@AllArgsConstructor
@ToString
public class Article {

    @Id  // 대표값 지정
    @GeneratedValue  // 자동생성 : 1,2,3, ...
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

//    생성자 리팩토링 : @AllArgsConstructor
//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }

//    toString 리팩토링 : @ToString
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
