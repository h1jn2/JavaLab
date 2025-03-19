package ch3.section1;

// call by value, call by reference

class User {
    String name;
    int score;

}

public class Exam4 {
    void changeValue1(int score1, int score2) {
        int temp = score1;
        score1 = score2;
        score2 = temp;
    }

    void changeValue2(User obj1, User obj2) {
        int temp = obj1.score;
        obj1.score = obj2.score;
        obj2.score = temp;
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "kim";
        user1.score = 100;

        User user2 = new User();
        user2.name = "lee";
        user2.score = 90;

        // kim, 100, lee, 90
        System.out.println(user1.name + ", " + user1.score + ", " + user2.name + ", " + user2.score);

        Exam4 obj = new Exam4();
        // call by value: 함수 내에서 전달한 데이터가 변경되어도 호출한 곳에 영향없음
        obj.changeValue1(user1.score, user2.score);
        //kim, 100, lee, 90
        System.out.println(user1.name + ", " + user1.score + ", " + user2.name + ", " + user2.score);

        // call by reference: 객체의 주소가 넘어갔기 때문에 함수에서 이용하는 객체가 동일
        obj.changeValue2(user1, user2);
        // kim, 90, lee, 100
        System.out.println(user1.name + ", " + user1.score + ", " + user2.name + ", " + user2.score);
    }
}
