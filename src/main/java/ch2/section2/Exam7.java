package ch2.section2;

// 입력

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("메시지를 입력한 후 Enter (종료: quit)");

            // nextLine() 함수를 만나면 대기상태
            String message = input.nextLine();

            if (message.equals("quit"))
                break;
            System.out.println("입력한 메시지: " + message);
        }
        input.close();
    }
}
