package com.baseurak.AwesomeGreat.post;

import lombok.Data;

@Data
public class Post {
    private Long id;
    private String userId;
    private String datetime;
    private String contents;

    public Post(Long id, String userId, String datetime, String contents){
        this.id = id;
        this.userId = userId;
        this.datetime = datetime;
        this.contents = contents;
    }
}
