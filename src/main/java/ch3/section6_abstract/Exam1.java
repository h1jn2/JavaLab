package ch3.section6_abstract;

class Super1 {
}

abstract class Super2 {
    // 추상 함수가 없어도 상관은 없지만 의미가 없음
}

class Super3 {
    //추상 함수가 선언되어 있다면 클래스도 추상형으로 선언해야 함
//    abstract void method(); // error
}

abstract class Super4 {
    // 추상 함수는 Body를 가질 수 없음
//    abstract void method1() {}  // error
    abstract void method1();

    // 클래스가 추상형이여도 일반 함수 가능
    void method2() {
    }
}

// 추상 클래스 하위를 추상형으로 만들면 에러는 사라지지만 객체 생성 불가
abstract class Sub extends Super4 {
}

class Sub2 extends Super4 {
    // 상위의 추상 함수를 모두 오버라이드
    // 함수 재정의이므로 추상 함수를 가지지 않고 객체 생성 가능해짐
    @Override
    void method1() {

    }
}

// 상속받아서 작성하는 사람이 함수의 로직을 작성해야함
abstract class Student {
    String name;
    int score;

    Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    abstract void examTake();
    abstract void examSolve();
    abstract void examSubmit();

    void doExam() {
        // 아래의 함수를 호출하려면 이 클래스를 작성하는 시점에
        // 함수가 선언되어 있어야 함
        // 각 함수의 행위가 하위 클래스마다 로직이 다름
        examTake();
        examSolve();
        examSubmit();
    }
}

class HighStudent extends Student {
    HighStudent(String name, int score) {
        super(name, score);
    }

    @Override
    void examTake() {
        System.out.println("High take");
    }

    @Override
    void examSolve() {
        System.out.println("High solve");
    }

    @Override
    void examSubmit() {
        System.out.println("High submit");
    }

}

public class Exam1 {
    public static void main(String[] args) {
        Super1 obj1;
        Super2 obj2;    // 추상 클래스도 타입으로는 이용
        obj1 = new Super1();
//        obj2 = new Super2();    // error 추상 클래스는 객체화 불가능

        // Student 의 doExam()을 실행시키는 것 같지만 실제론 HighStudent
        Student student = new HighStudent("kim", 30);
        student.doExam();
    }
}
