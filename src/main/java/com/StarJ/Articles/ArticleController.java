package com.StarJ.Articles;

import com.StarJ.CommonUtils;

import java.util.List;

public class ArticleController {
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
        articleView.detailMessage(article);
    }

    public void search(String keyword) {
        List<Article> list = articleRepository.findByKeyword(keyword);
        if(list.size()==0) {
            articleView.cantFindByKeywordMessage();
            return;
        }
        articleView.searchMessages(list);
    }
}
