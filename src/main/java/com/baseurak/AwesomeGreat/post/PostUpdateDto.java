package com.baseurak.AwesomeGreat.post;

import lombok.Data;

@Data
public class PostUpdateDto {
    private String userId;
    private String datetime;
    private String contents;

    public PostUpdateDto() {
    }

    public PostUpdateDto(String userId, String datetime, String contents) {
        this.userId = userId;
        this.datetime = datetime;
        this.contents = contents;
    }
}
