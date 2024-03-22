package com.StarJ.Comments;

import com.StarJ.CommonUtils;

import javax.sound.midi.SysexMessage;
import java.util.List;

public class CommentView {
    public void addMessage() {
        System.out.println("댓글이 성공적으로 등록되었습니다.");
    }

    public void detailMessages(List<Comment> comments) {
        System.out.println("======= 댓글 =======");
        for(Comment comment : comments) {
            System.out.println("댓글 내용 : " + comment.getBody());
            System.out.println("작성일 : " + comment.getDate().format(CommonUtils.getDateTimeFormatter()));
            System.out.println("===================");
        }
    }

}
