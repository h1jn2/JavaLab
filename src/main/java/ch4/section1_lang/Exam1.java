package ch4.section1_lang;

class User { }

class Student extends User {
    String name;
    int age;

    // 이 클래스는 Object 의 서브클래스
    // Object 내에 toString() 함수가 존재: Object 의 해시값 출력
    // 데이터가 중심인 클래스를 만들 때 (함수가 중심인 곳에서는 잘 안 함)
    // 의미 없는 데이터가 출력되지 않도록 Override 해서 자신의 데이터가 출력되도록 재정의함
    // 디버깅의 용이성을 위해 어떤 객체의 데이터가 어떻게 들어있는 지 편하게 확인
    // System.out.println(obj.name + "," + obj.age + ...)
    // System.out.println(obj.toString());
    @Override
    public String toString() {
        return "Student: " + name + ", " + age;
    }
}
public class Exam1 {
    public static void main(String[] args) {
        // Object... getClass(): 실제 생성된 객체의 클래스명이 문자열로
        String str = "hello";
        System.out.println(str.getClass());
        User user = new User();
        System.out.println(user.getClass());
        User user2 = new Student();
        System.out.println(user2.getClass());
//        class java.lang.String
//        class ch4.section1_lang.User
//        class ch4.section1_lang.Student

        // Object... equals(): 해시코드 값을 기준으로 객체가 같은 지 비교
        User user3 = new User();
        User user4 = user;
        System.out.println(user.equals(user3)); // false
        System.out.println(user.equals(user4)); // true

        // Object... toString(): 정보 출력
        // 객체명만 지정해도 내부적으로 toString() 호출 및 반환 정보 출력
        System.out.println(user);
        System.out.println(user.toString());
//        ch4.section1_lang.User@2ff4acd0
//        ch4.section1_lang.User@2ff4acd0
        System.out.println(user2);
//        Student: null, 0
        // 위의 코드는 Object 의 toString() 이 이용된 것
        // 아래의 코드는 toString() 을 오버라이드 했으므로 개발자가 정의한 함수 호출

        Object obj = new User();
        Object obj1 = new String("hello");
        Object[] arr = {new User(), new String()};
    }
}
