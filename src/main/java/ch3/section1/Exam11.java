package ch3.section1;

// Override

// 상위
class Stud {
    String name;
    int score;
    void printInfo() {
        System.out.println(name + "의 점수는 " + score);
    }
    void method() {}
}
class UniversityStudent extends Stud {
    String major;

    // override 로 상위 함수 상속되지 않게 하고 동일 행동을 재정의
    @Override
    void printInfo() {
        // super 가 꼭 들어가야 하는 것은 아님
        // 경우에 따라 자신의 함수와 상위의 함수 둘 다 호출하고 싶다면
        // 명시적으로 상위임을 밝혀줘야함
        super.printInfo();
        System.out.println(name + ", " + major + ", " + score);
    }

    // 매개변수를 다르게 하면 상위 함수 상속 -> Override 아님 -> 오버로딩
    void method(int a) {}

    // 오버라이드 하면서 접근 제한의 범위를 넓힐 수는 있어도 줄일 수는 없음
//    private void method() {}    // error

    // return 타입 바꾸면 안 됨
//    int method() {return 0;}    // error
}
public class Exam11 {
    public static void main(String[] args) {
        UniversityStudent obj1 = new UniversityStudent();
        obj1.name = "kim";
        obj1.score = 100;
        obj1.major = "컴퓨터공학";
        obj1.printInfo();
//        kim�� ������ 100
//        kim, ��ǻ�Ͱ���, 100
    }

}
