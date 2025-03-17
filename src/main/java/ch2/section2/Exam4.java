package ch2.section2;

// if 조건문

public class Exam4 {
    public static void main(String[] args) {
        int javaScroe = 70;

        if (javaScroe >= 60) {
            if (javaScroe >= 80) {
                System.out.println("고득점입니다");
            }
            System.out.println("합격입니다");
        }

        javaScroe = 20;
        if (javaScroe >= 60) {
            System.out.println("합격입니다");
        } else {
            if (javaScroe <= 30) {
                System.out.println("패널티 대상입니다");
            }
            else {
                System.out.println("불합격입니다");
            }
        }

        // else if 는 처음 만족하는 부분만 실행
        javaScroe = 89;
        if (javaScroe >= 90) {
            System.out.println("A 등급입니다");
        } else if (javaScroe >= 80) {
            System.out.println("B 등급입니다");
        } else if (javaScroe >= 70) {
            System.out.println("C 등급입니다");
        } else if (javaScroe >= 60) {
            System.out.println("D 등급입니다");
        } else {
            System.out.println("F 등급입니다");
        }
    }
}
