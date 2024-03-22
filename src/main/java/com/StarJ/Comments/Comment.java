package com.StarJ.Comments;

import com.StarJ.Articles.Article;

import java.time.LocalDateTime;

public class Comment {
    private Article article;
    private String body;
    private final LocalDateTime date;


    public Comment(Article article, String body, LocalDateTime date) {
        this.article = article;
        this.body = body;
        this.date = date;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
