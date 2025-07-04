package me.jiyeon.azaazza.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity //엔티티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id //id필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) //'title이라는 not null 칼럼과 매핑
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder //빌더패턴으로 객체 생성
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
