package ch2.section1;

// 변수 선언, 초기화
public class Exam2 {
    // 변수 선언과 동시에 초기화
    int data1 = 0;
    //동일 타입의 변수를 여러개 선언
    // 초기화 시켜준 변수에만 값 할당
    int data2, data3, data4 = 10;

    // 클래스 멤버 변수: 클래스 내에 선언되는 변수
    // 클래스 멤버 변수는 선언과 동시에 초기값을 주지 않으면
    // default 값으로 초기화 됨
    // 숫자: 0, boolean: false, 객체: null

    boolean data5;
    String data6;

    void sayHello() {
        // data2: 0, data3: 0, data4: 10
        System.out.println("data2: " + data2 + ", data3: " + data3 + ", data4: " + data4);
        // data5: false, data6: null
        System.out.println("data5: " + data5 + ", data6: " + data6);

        // local variable (함수의 지역변수)
        // 지역변수는 dafault 초기화 되지 않기 때문에 초기화 명시해야함
        int data7;
//        System.out.println(data7);    // error

        // 변수가 이용되는 영역 (scope)
        for (int i = 0; i < 1; i++) {
            int data8 = 0;
        }

        //  scope 밖에서 사용 불가
//        System.out.println(data8);  // error
    }
    public static void main(String[] args) {
        new Exam2().sayHello();
        // 클래스 멤버 변수는 클래스 전역에서 사용 가능
        new Exam2().data2 = 40;
        // 함수의 지역변수는 그 함수 내에서만 사용 가능
//        new Exam2().data7 = 40;     // error
    }
}
