package ch3.section5_inherited;

// 객체 캐스팅은 상하위 관계에서만 가능

class Superr {
}

class Sub extends Superr {
}

public class Exam13 {
    public static void main(String[] args) {
        Superr obj1 = new Superr();
        Sub obj2 = new Sub();

        // 실제 생성되는 객체는 Sub, 타입으로 Super
        // Super 에 선언된 멤버만 사용 가능
        // 암시적 캐스팅 - 하위 -> 상위
        Superr obj3 = new Sub();
        obj3 = obj2;    // 하위 -> 상위

//        Sub obj4 = obj3;    // error 상위 -> 하위
        Sub obj4 = (Sub) obj3; // 명시적 캐스팅 - 상위 -> 하위

        //Exception in thread "main" java.lang.ClassCastException
//        Sub obj5 = (Sub) obj1;  // runtime error
        // 하위 -> 상위 -> 하위 인 경우에 한해서만 상위가 하위로 캐스팅
    }
}
