package com.StarJ;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommonUtils {
    private static Scanner scanner = new Scanner(System.in);


    public static Integer getInputInt(String msg) {
        try {
            System.out.print(msg);
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("숫자가 아닌 값이 입력되었습니다.");
            return null;
        }
    }

    public static String getInputString(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }
    public static DateTimeFormatter getDateTimeFormatter(){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
    }
}
