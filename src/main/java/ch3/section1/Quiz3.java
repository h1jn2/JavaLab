package ch3.section1;

// 다른 생성자 호출(this()) -> 멤버 초기화 (메모리 할당) -> 로직 실행
// 2 1 3 1 3 4
public class Quiz3 {
    // 선언구문이 아닌 실행구문은 클래스 영역에 못 쓰기 때문에 { } 내에서만
    {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }
    Quiz3() {
        System.out.println("3");
    }
    Quiz3(int a) {
        this();
        System.out.println("4");
    }

    public static void main(String[] args) {
        Quiz3 obj = new Quiz3();
        Quiz3 obj2 = new Quiz3(10);
    }
}
