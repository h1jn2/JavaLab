package ch3.section1;

public class Exam3 {
    void method1() {
        System.out.println("method1 call");
    }

    void method2(int arg1, String arg2, boolean arg3, int arg4) {
        System.out.println(arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4);
    }

    String method3(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return "1부터 " + num + "까지 더한 결과는 " + sum;
    }

    void method4() {
        System.out.println("method4 start");
        System.out.println("method4 end");
    }
    void method5() {
        System.out.println("method5 start");
        method4();
        System.out.println("method5 end");
    }

    void method6() {
        System.out.println("method6 start");
        method5();
        System.out.println("method6 end");
    }
    public static void main(String[] args) {
        Exam3 object = new Exam3();
        object.method1();
        object.method2(10, "hello", true, 30);

        String result = object.method3(10);
        System.out.println(result);

        System.out.println("main start");
        object.method6();
        System.out.println("main end");

//        main start
//        method6 start
//        method5 start
//        method4 start
//        method4 end
//        method5 end
//        method6 end
//        main end

    }
}
