package ch3.section4_static;

public class Exam9 {
    int objVar = 0;
    static int staticVar = 0;

    void objMethod() {
        // object member 의 함수에서는 object, static 모두 이용 가능
        objVar++;
        staticVar++;
        staticMethod();
    }
    static void staticMethod() {
        // 메모리 할당 순서가 다르기 때문에 object 멤버 이용 불가능
        // 이용하려면 객체생성으로 메모리 할당 후 이용해야 함
//        objVar++;   // error
        staticVar++;
//        objMethod();    // error
    }

    public static void main(String[] args) {
        staticVar++;

        Exam9 obj = new Exam9();
        obj.objVar++;
    }
}
