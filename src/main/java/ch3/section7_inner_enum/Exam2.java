package ch3.section7_inner_enum;

enum Direction {
    NORTH, SOUTH, EAST, WEST;
}

enum Direction2 {
    // enum 상수는 enum 클래스의 서브클래스 객체
    NORTH(100), SOUTH(200), EAST(300), WEST(400);

    // 개발자 임의 데이터를 상수에 추가하려면 먼저 enum 클래스 생성자 정의하고
    // 매개변수로 데이터 선언
    int price;
    Direction2(int price) {
        this.price = price;
    }
}

enum Direction3 {
    NORTH(1) {
        @Override
        void print() {
            System.out.println("north print");
        }
    }, SOUTH(2) {
        @Override
        void print() {
            System.out.println("south print");
        }
    }, EAST(3) {
        @Override
        void print() {
            System.out.println("east print");
        }
    }, WEST(4) {
        @Override
        void print() {
            System.out.println("west print");
        }
        // 상수 클래스만의 함수를 추가할 수 있음
        // enum 클래스 타입으로 사용되기 때문에 외부에서는 이용 절대 불가능
        void method() {}
    };

    int price;
    Direction3(int price) {
        this.price = price;
    }
    abstract void print();

    void enumFun() {}
}
public class Exam2 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        System.out.println(d1.name() + ", " + d1.ordinal());    //EAST, 2

        Direction2 d2 = Direction2.EAST;
        System.out.println(d2.name() + ", " + d2.ordinal() + ", " + d2.price);  //EAST, 2, 300

        Direction3 d3 = Direction3.EAST;
        d3.print();
        d3.enumFun();
    }
}
