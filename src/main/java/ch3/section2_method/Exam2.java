package ch3.section2_method;

class Student {
    String name;
    int score;

    void printInfo() {
        System.out.println(name + "의 점수: " + score);
    }
}
public class Exam2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "kim";
        s1.score = 100;

        Student s2 = new Student();
        s2.name = "lee";
        s2.score = 90;

        s1.printInfo();
        s2.printInfo();

        System.out.println(s1 == s2);   // false

        // 객체를 선언했지만 new로 새로 생성한 것이 아니라
        // 기존 객체를 그대로 대입하여 메모리 주소를 복사
        // 두 객체는 동일한 메모리를 지칭
        Student s3 = s1;
        System.out.println(s1.name + ", " + s3.name);   // kim, kim
        s1.name = "park";
        System.out.println(s1.name + ", " + s3.name);   // park, park
        s3.name = "hong";
        System.out.println(s1.name + ", " + s3.name);   // hong, hong

        System.out.println(s1 == s3);   // true
    }
}
