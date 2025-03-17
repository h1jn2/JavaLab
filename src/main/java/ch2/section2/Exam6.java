package ch2.section2;

// while 문

public class Exam6 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);


        // 짝수 합
        sum = 0;
        i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

        // 구구단 찍기
        int dan = 2;
        int j = 1;
        while (dan <= 9) {
            System.out.println("=====" + dan + "단======");
            while (j <= 9) {
                System.out.println(dan + " * " + j + " = " + dan * j);
                j++;
            }
            j = 1;
            dan++;
        }
    }
}
