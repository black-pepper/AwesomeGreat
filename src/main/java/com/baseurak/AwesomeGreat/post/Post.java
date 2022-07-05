package com.baseurak.AwesomeGreat.post;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@AllArgsConstructor
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Timestamp uploadDate;
    private String content;
    private int report;

    public Post() {
    }
}
