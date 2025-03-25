package ch3.section8_exception;

public class Exam2 {
    void method1(){
        try {
            int result = 10 / 0;
        } catch (Exception e) {

        }
    }

    void method2() throws ArithmeticException {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // 실제 exception 이 전파되는 순간 return 과 동일한 효과
            throw new ArithmeticException();
        }
    }

    void method3() throws ArithmeticException {
        try {
            // throw 는 함수 전역에서 사용 가능
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            // catch 의 매개변수가 자신이 발생한 예외 상황
            throw e;

            // throws에 선언된 exception 보다 상위 타입의 exception은 불가능
//            throw new Exception();  // error
        }
    }

    public static void main(String[] args) {
        Exam2 obj = new Exam2();
        System.out.println("step1");
        obj.method1();
        System.out.println("step2");
//        step1
//        step2
        // method1에서 exception 발생을 catch 에서 대응
        // 이 함수를 호출한 쪽에선 exception 발생 상황을 모름

        // throw 에 의해 이 라인에서 에러가 발생한 효과
        try {
            obj.method2();
        } catch (Exception e) {

        }


    }
}
