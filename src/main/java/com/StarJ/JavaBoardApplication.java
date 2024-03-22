package com.StarJ;

public class JavaBoardApplication {
    private static boolean runStatus = false;
    private JavaBoardController javaBoardController = JavaBoardController.JAVA_BOARD_CONTROLLER;


    public void run() {
        runStatus = true;
        while (runStatus) {
            String cmd = CommonUtils.getInputString("명령어를 입력하세요 : ");
            switch (cmd) {
                case "exit" -> javaBoardController.exit();
                case "add" -> javaBoardController.add();
                case "list" -> javaBoardController.list();
                case "update" -> javaBoardController.update();
                case "delete" -> javaBoardController.delete();
                case "detail" -> javaBoardController.detail();
                case "search" -> javaBoardController.search();
                case "signup" -> javaBoardController.signup();
                case "login" -> javaBoardController.login();
                default -> System.out.println("없는 명령어 입니다.");
            }
        }
    }

    public static void setRunStatus(boolean runStatus) {
        JavaBoardApplication.runStatus = runStatus;
    }
}
