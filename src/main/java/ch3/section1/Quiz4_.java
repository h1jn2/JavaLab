package ch3.section1;

// 부서를 지칭하는 상수 변수를 꼭 별도의 클래스로 묶어야 하는 것은 아니지만
// 같은 의미를 지니는 상수 변수가 많다면 별도의 클래스로 묶기도 함

class DepartmentCode {
    final static int SALES = 0;
    final static int DEVELOPER = 1;
    final static int MARKETING = 2;
}

class Employeee {
    String name;
    int department;

    Employeee(String name, int department) {
        this.name = name;
        this.department = department;
    }
}
public class Quiz4_ {

    public static void main(String[] args) {
        Employeee employeeKim = new Employeee("kim", DepartmentCode.SALES);
        Employeee employeeLee = new Employeee("lee", DepartmentCode.DEVELOPER);
    }
}
