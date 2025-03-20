package ch3.section1;

// static과 메모리

class Count {
    int count;
    static int totalCount;

    void method1() {}
    static void method2() {}
}
public class Exam8 {
    public static void main(String[] args) {
//        method1();    // error
//        Count.method1();  // error

        // static 멤버는 객체 생성 전에 이용 가능
        // 클래스명.멤버명
        Count.method2();

        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

//        Count.count++;    // error
        c1.count++;
        Count.totalCount++;
        c3.count++;
        Count.totalCount++;
        c2.count++;
        Count.totalCount++;

        System.out.println(Count.totalCount + ", " + c1.count);
        System.out.println(Count.totalCount + ", " + c2.count);
        System.out.println(Count.totalCount + ", " + c3.count);

        // static 멤버 호출 정석은 클래스.멤버명
        // 객체로 접근도 허용하기는 하지만 권장하지 않음
    }
}
