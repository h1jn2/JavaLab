package ch3.section6_abstract;

interface ITest1 {
    // 자동으로 public static final 추가
    int COUNT = 1;
    // 아래와 동일
    public static final int MAX_SIZE = 10;

    // 접근제한자 public 으로 고정
//    private int a = 0;      // error
//    protected int b = 0;    // error

    // 자동으로 public abstract 추가
    void method1();

    // 아래와 동일
    public abstract void method2();

    // 구현체를 가지는 함수를 추가하고 싶을 때 default, static, private 중 하나
    // 구현한 객체에 그대로 상속 개념으로 이용
    default void method3() {
        System.out.println("default function");
        method1();
        method5();
    }

    static void method4() {

    }

    private void method5() {

    }
}

interface ITest2 {
    void iTest2();
}

interface ITest3 {
    void iTest3();
}

// 인터페이스를 선언하면서 다른 인터페이스를 상속받아 선언 가능
// 인터페이스는 다중 상속 가능
interface ITest4 extends ITest2, ITest3 {
    void iTest4();
}

abstract class AbstractClass {
    abstract void some1();
}

// 클래스 선언하면서 여러개의 인터페이스 구현 가능
class Sub1 extends AbstractClass implements ITest1, ITest4 {
    @Override
    void some1() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    // 인터페이스 내의 default로 선언된 함수를 구현 클래스 내에서
    // 오버라이드로 재선언이 가능
    @Override
    public void method3() {
        ITest1.super.method3();
    }

    @Override
    public void iTest2() {

    }

    @Override
    public void iTest3() {

    }

    @Override
    public void iTest4() {

    }
}

public class Exam2 {
    public static void main(String[] args) {
        Sub1 obj1 = new Sub1();

        // AbstractClass 타입 객체이기 때문에 AbstractClass 에 선언된 멤버만
        AbstractClass obj2 = new Sub1();

        // 인터페이스도 타입으로 이용 가능
        ITest1 obj3 = new Sub1();
        ITest4 obj4 = new Sub1();
        Object obj5 = new Sub1();
    }
}








