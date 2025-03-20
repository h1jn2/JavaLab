package ch3.section1;

// 부서를 지칭하는 상수 변수를 꼭 별도의 클래스로 묶어야 하는 것은 아니지만
// 같은 의미를 지니는 상수 변수가 많다면 별도의 클래스로 묶기도 함

class Employee {
    String name;
    int department;

    Employee(String name, int department) {
        this.name = name;
        this.department = department;
    }
}
public class Quiz4 {
    static final int DEPARTMENT_SALES = 0;
    static final int DEPARTMENT_DEVELOPER = 1;
    static final int DEPARTMENT_MARKETING = 2;

    public static void main(String[] args) {
        Employee employeeKim = new Employee("kim", DEPARTMENT_SALES);
        Employee employeeLee = new Employee("lee", DEPARTMENT_DEVELOPER);
    }
}
