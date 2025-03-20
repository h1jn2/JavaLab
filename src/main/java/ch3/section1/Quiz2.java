package ch3.section1;

class Math {
    int sum(int num1, int num2) {
        return num1 + num2;
    }
    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    int sum(int ... num1) {
        int sum = 0;

        for (int data: num1) {
            sum += data;
        }
        return sum;
    }
}
public class Quiz2 {
    public static void main(String[] args) {
        Math math = new Math();

        System.out.println(math.sum(10, 20));
        System.out.println(math.sum(10, 20, 30));
        System.out.println(math.sum(10, 20, 30, 40, 50));
    }
}
