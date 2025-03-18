package ch2.section2;

// for 문

public class Exam8 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 1; i <= 10; i+=2) {
            sum += i;
        }
        System.out.println(sum);

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=======" + dan + "단========");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + dan * i);
            }
        }
    }
}
