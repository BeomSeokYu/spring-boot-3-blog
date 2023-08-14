package com.hihat.blog.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // protected 기본 생성자
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    @Column(name ="id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) // Not Null
    private String title;

    @Column(name = "content", nullable = false) // Not Null
    private String content;

    @Builder    // 빌더 패턴으로 객체 생성
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}