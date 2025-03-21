package ch3.section1;

// 운영 정책이 바뀌는 상황이 생길 수 있기 때문에 유지보수성을 위해
// 변수에 바로 접근하는 것을 거부
class Userr {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Quiz5 {
}
