package com.StarJ.Articles;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private int totalId = 0;
    private List<Article> list = new ArrayList<>();

    public ArticleRepository() {
        intialData();
    }

    public void intialData() {
        addAritcle("안녕하세요 반갑습니다. 자바 공부중이에요.", "냉무");
        addAritcle("자바 질문좀 할게요~", "냉무");
        addAritcle("정처기 따야되나요?", "냉무");
    }

    public void addAritcle(String title, String body) {
        totalId++;
        list.add(new Article(totalId, title, body, LocalDateTime.now(), 0));
    }


    public void update(Article article, String title, String body) {
        article.setTitle(title);
        article.setBody(body);
    }

    public void addView(Article article) {
        article.setView(article.getView() + 1);
    }

    public void delete(Article article) {
        list.remove(article);
    }

    public List<Article> findByKeyword(String keyword) {
        List<Article> list = new ArrayList<>();
        for (Article article : this.list)
            if (article.getTitle().contains(keyword))
                list.add(article);
        return list;
    }

    public Article findById(int id) {
        for (Article article : list)
            if (article.getId() == id)
                return article;
        return null;
    }

    public List<Article> findAll() {
        return list;
    }

}
