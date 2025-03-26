package ch4.section2_util;

import java.util.Calendar;
import java.util.Date;

public class Exam1 {
    public static void main(String[] args) {
        // 시스템의 현재 시간
        Date d = new Date();
        System.out.println(d);  //Wed Mar 26 10:11:35 KST 2025

        // 특정 시간날짜를 지정하지 않으면 현재 시간
        Calendar c = Calendar.getInstance();

        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
