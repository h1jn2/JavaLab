package ch2.section2;

public class Quiz {
    public static void main(String[] args) {
        int num = 2;

        if (num >= 3 && num <= 5) {
            System.out.println("봄입니다");
        } else if (num >= 6 && num <= 8) {
            System.out.println("여름입니다");
        } else if (num >= 9 && num <= 11) {
            System.out.println("가을입니다");
        } else if (num == 12 || num == 1 || num == 2) {
            System.out.println("겨울입니다");
        }
    }
}
