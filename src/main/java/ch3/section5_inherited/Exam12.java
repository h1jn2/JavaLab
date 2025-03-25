package ch3.section5_inherited;

// final

// 상속 금지 -> 확장 금지, 서브클래스 금지
final class Super {
    // 변수 앞 선언: 상수 변수
    final int a = 0;
    final int b;

    Super (int a, int b) {
        // final 로 변수 선언과 동시에 값을 주지 않고 생성자에서 초기값 주기 가능
        this.b = b;
    }

//    final Super () {}   // error final 은 생성자 사용 불가

    // override 금지 -> 절대 재정의 하지 못하도록
//    final void method() {}
    void method() {}
}

//class Sub extends Super {
//    Sub() {
//        super(10, 20);
//    }
//
//    @Override
//    void method() {
//        super.method();
//    }
//}
public class Exam12 {

}
