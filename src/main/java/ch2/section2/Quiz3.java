package ch2.section2;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("소수인 지 판단할 숫자: ");

        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                System.out.println("소수가 아닙니다1");
                break;
            }
            if (i == num)
                System.out.println("소수입니다2");
        }

        if (num == 1) {
            System.out.println("소수가 아닙니다");
        }
    }
}
