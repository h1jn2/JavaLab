package ch3.section1;

// 함수 오버로딩

// 이 클래스의 함수를 이용하면 어플리케이션의 로그를 출력
class Log {
    void log(String arg) {
        System.out.println(arg);
    }
    void log (int arg) {
        System.out.println(arg);
    }
    void log (boolean arg) {
        System.out.println(arg);
    }
}
public class Exam6 {
    public static void main(String[] args) {
        Log obj = new Log();
        obj.log("hello");
        obj.log(10);
        obj.log(true);
    }
}
