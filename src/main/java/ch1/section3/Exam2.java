package ch1.section3;   // 자바 파일이 있는 물리적인 폴더 위치
//package aaa   // error (패키지는 가장 첫줄에, 한번만)

// 다른 패키지에 선언된 클래스를 사용하려면 import 구문 사용
// 동일 패키지의 다른 자바 클래스 사용 시 import 구문 사용 X
import ch1.section3.sub.Exam1_2;
import ch1.section3.sub.*;

// 변수, 함수는 top level 에 선언될 수 없음
//int a = 10;
//void sayHello() {}

public class Exam2 {
    Exam1 obj;
    Exam1_2 some;

    // top level 구성 요소는 클래스만 허용
    // 모든 변수, 함수는 클래스 내에 선언 (클래스의 멤버 변수, 함수)
    int a = 10;
    void sayHello() {}
}
