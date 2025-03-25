package ch3.section8_exception;

public class Exam1 {
    void method1(int num1, int num2) {
        int result = num1 / num2;
        System.out.println("end..." + result);
    }

    void method2(int num1, int num2) {
        try {
            // 정상 실행되어야 하는 부분
            System.out.println("start...");
            int result = num1 / num2;
            System.out.println("end..." + result);
        } catch (Exception e) {
            // try 부분에 exception 발생 시점에 실행되어야 하는 부분
            // catch 매개변수로 발생한 exception 정보가 넘어옴
            System.out.println("catch...");
            // 현재 발생한 에러를 로그로 출력
            e.printStackTrace();
        } finally {
            System.out.println("finally...");
        }
        System.out.println("end...");
    }

    void method3(int num, String name) {
        try {
            int result = 10 / num;
            name.substring(1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException...");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException...");
        } catch (Exception e) {
            // 예외 정보를 표현하는 클래스, 타입
            // 모든 exception 의 최상위 타입이 Exception
            System.out.println("Exception...");
        }
//        catch (NullPointerException e) {
//            // catch 가 여러개 들어갈 수 있지만 위에서부터 순차적인 판단이기 때문에
//            // 한 순간에 하나의 catch 만 실행됨
//            // 위에 상위타입의 exception 이 선언되어있어 이 부분이 실행될 수 없음
//        }
    }

    public static void main(String[] args) {
        Exam1 obj = new Exam1();
        obj.method1(10, 5);
        //Exception in thread "main" java.lang.ArithmeticException
        // 대체를 준비하지 않아 에러발생 -> 프로그램 종료
//        obj.method1(10, 0);   // error

        obj.method2(10, 5);
        // 에러가 발생했지만 프로그램은 정상적으로 실행되었음
        obj.method2(10, 0);

        obj.method3(0, "kim");
        obj.method3(10, null);
    }
}
