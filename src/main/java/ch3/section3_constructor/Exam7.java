package ch3.section3_constructor;

class Stu {
    String name;
    int score;
    boolean isPassed;
    String major;

    // 개발자가 명시적으로 생성자를 추가하지 않으면 컴파일러에 의해 default 생성자 추가
    // default constructor -> 매개변수를 가지지 않는 아래와 같은 형태
//    Stu() {}

    // 이름이 없는 학생은 존재할 수 없기 때문에 객체를 생성하면서
    // 필수 데이터를 매개변수로 받아 생성과 동시에 초기화
    Stu(String name) {
        this.name = name;
    }

    // 다른 멤버변수도 필요하다면
    Stu(String name, int score, boolean isPassed, String major) {
        // 멤버변수와 로컬변수의 이름이 동일하다면 로컬변수가 지칭된다
        //this.멤버로 명확하게 멤버변수 지정
        this(name);
        this.score = score;
        this.isPassed = isPassed;
        this.major = major;
//        this(name);   // error 가장 첫줄에 한번만
    }

    // 생성자를 여러개 선언하다보면 생성자 내의 코드가 중복되는 경우가 많음
    // 생성과 동시에 최초에 한번만 실행되는 코드이다 보니 대부분 중복
}

public class Exam7 {
    public static void main(String[] args) {
        // 객체 생성 구문: 객체 생성을 위한 생성자 호출 구문
        Stu obj = new Stu("kim");
        Stu obj2 = new Stu("lee", 100, true, "java");
        System.out.println(obj.name + ", " + obj2.name + ", " + obj2.score);
    }
}
