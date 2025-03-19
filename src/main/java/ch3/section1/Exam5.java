package ch3.section1;

// 가변 인수

public class Exam5 {
    void method1(int ...args) {
        // instanceof: 객체의 타입 확인 연산자
        System.out.println(args instanceof int[]);  // int -> true
        for (int data: args) {
            System.out.println(data);
        }
    }

    // 가변 인수와 다른 인수를 같이 선언 가능
    void method3(String arg1, int...args) { }

    // 가변 인수는 함수 내에서 하나만
    // 가변 인수는 마지막에
//    void method4(String... arg1, int... arg2) { } // error
//    void method5(int... args, String args2) { }   // error
    public static void main(String[] args) {
        Exam5 obj = new Exam5();
        obj.method1();
        obj.method1(1, 2, 3);
        obj.method1(1, 2, 3, 4, 5, 6);
    }
}
