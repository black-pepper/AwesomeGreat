package com.baseurak.AwesomeGreat.post;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String uploadDate;
    private String content;
    private int report;

    public Post() {
    }

//    public Post(Long id, Long userId, String uploadDate, String content, Integer report) {
//        this.id = id;
//        this.userId = userId;
//        this.uploadDate = uploadDate;
//        this.content = content;
//        this.report = report;
//    }
}
