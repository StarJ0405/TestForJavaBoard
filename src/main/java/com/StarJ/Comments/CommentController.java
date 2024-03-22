package com.StarJ.Comments;

import com.StarJ.Articles.Article;
import com.StarJ.Articles.ArticleController;
import com.StarJ.CommonUtils;

import java.util.List;

public class CommentController {
    public static final CommentController COMMENT_CONTROLLER = new CommentController();
    private final CommentRepository commentRepository = new CommentRepository();
    private final CommentView commentView = new CommentView();

    private CommentController() {
    }

    public void view(List<Comment> comments) {
        commentView.detailMessages(comments);
    }

    public Comment add(Article article) {
        String body = CommonUtils.getInputString("댓글 내용 : ");
        Comment comment = commentRepository.add(article, body);
        commentView.addMessage();
        return comment;
    }

}
