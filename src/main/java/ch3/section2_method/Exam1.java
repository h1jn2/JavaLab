package ch3.section2_method;

// 클래스 선언 및 객체 생성
// 클래스의 구성은 변수, 함수, 생성자
class Car {
    // 멤버 변수: 상태
    double KILOMETERS_PER_LITER;
    double kilometerDriven;
    double lightOil;

    // 생성자: 객체 생성
    Car() {
        KILOMETERS_PER_LITER = 30;
        kilometerDriven = 0;
        lightOil = 0;
    }

    Car(double kpl) {
        if (kpl > 0) {
            KILOMETERS_PER_LITER = kpl;
        } else {
            KILOMETERS_PER_LITER = 30;
        }
        kilometerDriven = 0;
        lightOil = 0;
    }

    // 멤버 메소드 (함수): 행동
    double getKilometerPerLiter() {
        return KILOMETERS_PER_LITER;
    }

    double getKilometerDriven() {
        return kilometerDriven;
    }

    public double getLightOil() {
        return lightOil;
    }

    void addLightOil(double amount) {
        if (amount > 0) {
            lightOil += amount;
        }
    }

    void drive(double kilometers) {
        if (kilometers < KILOMETERS_PER_LITER) {
            kilometerDriven += kilometers;
            lightOil -= kilometers / KILOMETERS_PER_LITER;
        } else {
            System.out.println("기름이 부족합니다.");
        }
    }
}

public class Exam1 {
    public static void main(String[] args) {
        // 클래스를 기반으로 객체 생성 사용
        // 객체 생성 순간에 메모리 할당 -> new
        // 생성된 객체에는 메모리 주소값이 있음 -> Reference 변수
        Car car = new Car(20);

        car.addLightOil(40);
        car.drive(100);
    }
}
