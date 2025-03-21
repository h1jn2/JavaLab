package ch3.section1.test1;

import ch3.section1.test1.sub.Super;
import ch3.section1.test1.sub.Two;

public class Exam3 extends Super {
    public static void main(String[] args) {
        // 동일 패키지의 클래스 이용
        One one = new One();
        one.publicData++;
        one.protectedData++;
        one.defaultData++;
//        one.privateData++;  // error

        // 다른 패키지의 클래스 이용
        Two two = new Two();
        two.publicData++;
//        two.protectedData++;    // error
//        two.defaultData++;      // error
//        two.privateData++;      // error

        // 패키지가 다른 상위 멤버
        Exam3 obj = new Exam3();
        obj.publicSuperData++;
        obj.protectedSuperData++;   // 패키지가 다르지만 상속관계 하위라면 가능
//        obj.defaultSuperData++;     // error
//        obj.privateSuperData++;     // error
    }
}

// 접근제한자는 모든 곳에 모든 제한자가 추가되지 않음
// 클래스 선언에는 public 과 default 만 허용
class A { }
//private class A2 { }    // error
//protected class A3 { }  // error

class B {
    // 생성자에도 모든 접근제한자 사용 가능
    B() {}
    public B(int a) {}
    protected B(String a) {}
    private B(double a) {}

    void method() {
        // 접근제한자와 로컬변수는 관련이 없음
        // 로컬 변수는 함수가 실행되는 중에만 사용되기 때문
//        public int a = 0;         //error
//        protected int a = 0;      // error
//        private int a = 0;        // error
    }
}
