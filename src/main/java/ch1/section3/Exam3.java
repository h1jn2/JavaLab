package ch1.section3;

public class Exam3 {
    // JVM 에 의해 실행될 클래스는 main 함수를 가지고 있어야 함
    public static void main(String[] args) {
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
