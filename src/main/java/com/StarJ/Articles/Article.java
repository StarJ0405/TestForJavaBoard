package com.StarJ.Articles;

import com.StarJ.Comments.Comment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Article {
    private final int id;
    private String title;
    private String body;
    private final LocalDateTime date;
    private int view;
    private List<Comment> comments;
    public Article(int id, String title, String body, LocalDateTime date, int view) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = date;
        this.view = view;
        this.comments= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
