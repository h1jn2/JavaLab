package ch2.section3;

// 배열 loop

public class Exam2 {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // scores - 배열처럼 여러건의 데이터를 가지는 객체
        for (int sc: scores) {
            System.out.println(sc);
        }
    }
}
