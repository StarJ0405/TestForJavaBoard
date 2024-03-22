package com.StarJ;

import com.StarJ.Articles.ArticleController;

public class JavaBoardController {
    private final ArticleController articleController = new ArticleController();

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
        JavaBoardApplication.setRunStatus(false);
    }

    public void add() {
        String title = CommonUtils.getInputString("게시물 제목을 입력해주세요 : ");
        String body = CommonUtils.getInputString("게시물 내용을 입력해주세요 : ");
        articleController.add(title, body);
    }

    public void list() {
        articleController.list();
    }

    public void update() {
        Integer id = CommonUtils.getInputInt("수정할 게시물 번호 : ");
        if (id == null)
            return;
        articleController.update(id);
    }

    public void delete() {
        Integer id = CommonUtils.getInputInt("삭제할 게시물 번호 : ");
        if (id == null)
            return;
        articleController.delete(id);
    }

    public void detail() {
        Integer id = CommonUtils.getInputInt("상세보기 할 게시물 번호를 입력해주세요 : ");
        if (id == null)
            return;
        articleController.detail(id);
    }

    public void search() {
        String keyword = CommonUtils.getInputString("검색 키워드를 입력해주세요 : ");
        articleController.search(keyword);
    }
}
