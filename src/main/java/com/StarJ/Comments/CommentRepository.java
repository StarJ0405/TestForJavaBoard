package com.StarJ.Comments;

import com.StarJ.Articles.Article;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private final List<Comment> list = new ArrayList<>();

    public Comment add(Article article, String body) {
        Comment comment = new Comment(article, body, LocalDateTime.now());
        list.add(comment);
        return comment;
    }

}
