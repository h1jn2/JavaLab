package ch2.section2;

// 비트 연산자, 3항 연산자

public class Exam3 {
    public static void main(String[] args) {
        int a = 3;  // 0000 0011
        int b = 5;  // 0000 0101

        System.out.println("(a & b) = " + (a & b));
        System.out.println("(a | b) = " + (a | b));
        System.out.println("(a ^ b) = " + (a ^ b));
        System.out.println("(a >> 1) = " + (a >> 1));
        System.out.println("(a << 1) = " + (a << 1));

        // 3항 연산자: 조건에 따라 값이 다르게 나올 때 사용
        int javaScore = 83;
        // 60점 이상이면 합격, 이하면 불합격이라고 출력하고 싶을 때
        String result = javaScore >= 60 ? "합격" : "불합격";
        System.out.println(result);
    }
}
