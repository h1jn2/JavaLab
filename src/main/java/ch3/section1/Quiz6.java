package ch3.section1;

// 싱글톤 클래스 만들기
class Singletone {
    int a = 0;

    // 외부에서 생성자를 접근하면 마음대로 몇번이고 생성
    // 내부에서 생성하지 않는 한 외부에서는 생성할 수 없음
    private Singletone() {}

    // 객체를 생성하지 않고 사용할 수 있는 구성요소 -> static
    private static Singletone instance;

    // 외부에서 객체를 획득할 수 있는 함수를 제공
    public static Singletone getInstance() {
        if (instance == null) {
            // 이 함수가 호출된 시점에 객체 생성이 안 되어 있다면 생성
            instance = new Singletone();
        }
        return instance;
    }
}
public class Quiz6 {
    public static void main(String[] args) {
//        Singletone obj = new Singletone();  // error
        Singletone obj1 = Singletone.getInstance();
        Singletone obj2 = Singletone.getInstance();

        // 만약 객체가 여러개 생성 되었다면 obj1과 obj2는 다를 것이고
        // 하나만 생성되면 동일값일 것읻
        obj1.a = 10;
        obj2.a = 20;

        System.out.println(obj1.a + ", " + obj2.a);
    }
}
