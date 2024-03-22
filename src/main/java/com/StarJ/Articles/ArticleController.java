package com.StarJ.Articles;

import com.StarJ.Comments.Comment;
import com.StarJ.Comments.CommentController;
import com.StarJ.CommonUtils;

import java.util.List;

public class ArticleController {
    public final static ArticleController ARTICLE_CONTROLLER = new ArticleController();
    private CommentController commentController = CommentController.COMMENT_CONTROLLER;

    private ArticleController() {
    }

    private final ArticleRepository articleRepository = new ArticleRepository();
    private final ArticleView articleView = new ArticleView();

    public void add(String title, String body) {
        articleRepository.addAritcle(title, body);
        articleView.addMessage();
    }

    public void list() {
        articleView.listMessage(articleRepository.findAll());
    }

    public void update(int id) {
        Article article = articleRepository.findById(id);
        if (article == null) {
            articleView.cantFindByIdMessage();
            return;
        }
        String title = CommonUtils.getInputString("제목 : ");
        String body = CommonUtils.getInputString("내용 : ");
        articleRepository.update(article, title, body);
        articleView.updateMessage(id);
    }

    public void delete(int id) {
        Article article = articleRepository.findById(id);
        if (article == null) {
            articleView.cantFindByIdMessage();
            return;
        }
        articleRepository.delete(article);
        articleView.deleteMessage(id);
    }

    public void detail(int id) {
        Article article = articleRepository.findById(id);
        if (article == null) {
            articleView.cantFindByIdMessage();
            return;
        }
        Integer num = null;
        while (num == null || num != 5) {
            articleRepository.addView(article);
            articleView.detailMessage(article);
            commentController.view(articleRepository.getComments(article));
            num = CommonUtils.getInputInt("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            switch (num) {
                case 1 -> addComment(article, commentController.add(article));

                case 5 -> articleView.detailBackMessage();
            }
        }
    }

    public void search(String keyword) {
        List<Article> list = articleRepository.findByKeyword(keyword);
        if (list.size() == 0) {
            articleView.cantFindByKeywordMessage();
            return;
        }
        articleView.searchMessages(list);
    }

    public void addComment(Article article, Comment comment) {
        articleRepository.addComment(article, comment);
    }
}
