package com.baseurak.AwesomeGreat.post;

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

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
