package ch2.section2;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양수를 입력하세요: ");

        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if (i == j) {
                    System.out.println(i + " ");
                }

            }
        }
    }
}
