package com.StarJ.Articles;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    public int totalId = 0;
    private List<Article> list = new ArrayList<>();

    public void addAritcle(String title, String body) {
        totalId++;
        list.add(new Article(totalId, title, body));
    }


    public void update(Article article, String title, String body) {
        article.setTitle(title);
        article.setBody(body);
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
