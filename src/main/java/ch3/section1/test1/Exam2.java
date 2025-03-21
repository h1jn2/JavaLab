package ch3.section1.test1;

// extends 명시하지 않은 클래스는 자동으로 Object 클래스를 상속받게 되어있음
class Super1 {}

class Sub1 extends Super1 {}

class Super2 {
    // 개발자가 생성자를 추가하기 시작하면 컴파일러에 의해 default 생성자
    // 추가가 안되기 때문에 이 클래스는 매개변수 하나의 생성자만 있음
    Super2(int a) {}
}

class Sub2 extends Super2 {
    // 모든 하위 생성자는 객체를 생성할 때 무조건 상위 생성자가 호출되어야 함
    Sub2() {
//        super();  //error 상위에 default 생성자가 없어서 생성자 호출이 안 맞음
        // 개발자가 생성자를 직접 정의해서 상위 생성자 호출 구문을 맞춰줘야함
        super(10);
    }

}

class Super3 {
    Super3(int a) {}
    Super3(String a, int b) {}
}

class Sub3 extends Super3 {
    Sub3(int a) {
        super(10);
//        super("hello", 20); // error super()로 상위 생성자 호출은 첫줄에 한번만
    }
    Sub3(String a, int b) {
        // 생성자를 어떻게 연결하든 생성자가 호출되게 만들기만 하면 됨
//        super(b);     // error
        this(b);
    }
}

public class Exam2 {
}
