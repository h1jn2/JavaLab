package ch3.section1.test1;

class Student {
    String name;
    int score;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class HighStudent extends Student {
    int classNumber;

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }
}

class UniversityStudent extends Student {
    String major;

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

public class Exam1 {
    public static void main(String[] args) {
        UniversityStudent obj1 = new UniversityStudent();
        obj1.name = "홍길동";
        obj1.setScore(30);
        obj1.major = "컴퓨터공학";

        HighStudent obj2 = new HighStudent();
        obj2.name = "김길동";
        obj2.setScore(60);
        obj2.classNumber = 2;
    }
}
