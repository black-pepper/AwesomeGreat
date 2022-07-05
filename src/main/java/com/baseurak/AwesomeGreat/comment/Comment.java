package com.baseurak.AwesomeGreat.comment;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="comments")
@AllArgsConstructor
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long postId;
    private Long userId;
    private Timestamp uploadDate;
    private String content;
    private int report;

    public Comment() {
    }
}
