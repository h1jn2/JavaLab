package ch2.section3;

public class Quiz2 {
    public static void main(String[] args) {
        int[] arr = {7, 44, 16, 32, 1, 22};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int num: arr) {
            System.out.println(num);
        }
    }
}
