package com.example.GitHubRESTAPI.DTO;

import java.util.Date;

public class GitRepoCommitDTO {
    private String id;
    private String authorName;
    private String message;
    private Date date;

    public GitRepoCommitDTO() {
        // for ser & de-ser
    }

    public GitRepoCommitDTO(String id, String authorName, String message, Date date) {
        this.id = id;
        this.authorName = authorName;
        this.message = message;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
