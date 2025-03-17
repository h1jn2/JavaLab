package ch2.section2;

// 증감 연산자, 비교 연산자 테스트

public class Exam2 {
    public static void main(String[] args) {
        // 증감 연산자, 연산자 우선순위
        // 같은 라인에서 다른 연산자와 같이 쓰이는 경우 증감 연산자 위치 중요
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int b = 10;
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);

        int c = 10;
        int d = 10;
        System.out.println(c++);
        System.out.println(++d);

        // 논리연산자 하나일 때와 두개일 때의 차이
        // 결과는 똑같지만 왼쪽이 false 일 때, 오른쪽이 실행되는 지에 대한 차이
        int e1 = 10;
        int f1 = 10;
        if (--e1 > 10 & --f1 > 10) {
            System.out.println("if 1 - true");
        }

        int e2 = 10;
        int f2 = 10;
        if (--e2 > 10 && --f2 > 10) {
            System.out.println("if 2 - true");
        }

        // e1: 9, f1: 9, e2: 9, f2: 10
        System.out.println("e1: " + e1 + ", f1: " + f1 + ", e2: " + e2 + ", f2: " + f2);
    }
}
