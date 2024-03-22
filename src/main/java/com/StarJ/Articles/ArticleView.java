package com.StarJ.Articles;

import com.StarJ.CommonUtils;

import java.util.List;

public class ArticleView {
    public void addMessage() {
        System.out.println("게시물이 등록되었습니다.");
    }

    public void listMessage(List<Article> articles) {
        System.out.println("==================");
        for (Article article : articles) {
            System.out.println("번호 : " + article.getId());
            System.out.println("제목 : " + article.getTitle());
            System.out.println("==================");
        }
    }

    public void cantFindByIdMessage() {
        System.out.println("존재하지 않는 게시물 번호입니다.");
    }

    public void cantFindByKeywordMessage() {
        System.out.println("===================");
        System.out.println("검색 결과가 없습니다.");
        System.out.println("===================");
    }

    public void updateMessage(int id) {
        System.out.println(id + "번 게시물이 수정되었습니다.");
    }

    public void deleteMessage(int id) {
        System.out.println(id + "번 게시물이 삭제되었습니다.");
    }

    public void detailMessage(Article article) {
        System.out.println("===================");
        System.out.println("번호 : " + article.getId());
        System.out.println("제목 : " + article.getTitle());
        System.out.println("내용 : " + article.getBody());
        System.out.println("등록날짜 : " + article.getDate().format(CommonUtils.getDateTimeFormatter()));
        System.out.println("조회수 : " + article.getView());
        System.out.println("===================");
    }

    public void searchMessages(List<Article> articles) {
        System.out.println("===================");
        for (Article article : articles) {
            System.out.println("번호 : " + article.getId());
            System.out.println("제목 : " + article.getTitle());
            System.out.println("===================");
        }
    }
}
