package ch4.section2_util;

import java.util.regex.Pattern;

public class Exam2 {
    public static void main(String[] args) {
        String tel = "010-1234-5678";
        String email = "a@a.com";

        // 유저에게 받은 데이터는 비 신뢰적이라고 판단하여 유효성 검증할 때
        // 원하는 패턴의 문자열인지 검사하기 위해 패턴을 명시한 정규표현식 문자열
        String telPattern = "01[0-9]-\\d{3,4}--\\d{4}";
        String emailPattern = "\\w+@\\w+\\.\\w+(\\.\\w+)?";

        if (Pattern.matches(telPattern, tel)) {
            System.out.println("정상적인 전화번호");
        } else {
            System.out.println("잘못된 전화번호");
        }

        if (Pattern.matches(emailPattern, email)) {
            System.out.println("정상적인 이메일");
        } else {
            System.out.println("잘못된 이메일");
        }
    }
}
