package ch3.section5_inherited;

// 공통 코드 개발자가 작성했다고 가정
class Employeeee {
    String name;
    int salary = 100;

    int calcBonus() {
        System.out.println("Employeeee 보너스 계산기");
        return salary * 12;
    }
}

class Calc {
    public static void calcBonus(Employeeee e) {
        System.out.println(e.calcBonus());
    }
}

class Salesman extends Employeeee {
    @Override
    int calcBonus() {
        System.out.println("Salesman 보너스 계산");
        return salary * 12 * 4;
    }
}

class Consultant extends Employeeee {
    @Override
    int calcBonus() {
        System.out.println("Consultant 보너스 계산");
        return salary * 12 * 2;
    }
}
public class Exam14 {
    public static void main(String[] args) {
        Calc.calcBonus(new Salesman());
    }
}
