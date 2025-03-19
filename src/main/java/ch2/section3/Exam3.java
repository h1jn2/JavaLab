package ch2.section3;

// 이차원배열

public class Exam3 {
    public static void main(String[] args) {
        int[][] scores = {
                {10, 20},
                {30, 40},
                {20, 40}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        int arr1[][];
        int[][] arr2;
        int []arr3[];

//        arr1 = new int[][]; //error
//        arr1 = new int[][3];    //error
        arr1 = new int[3][3];
        arr1 = new int[3][];

        // 앞 부분의 사이즈를 지정했다면
        arr1[0] = new int[4];
        arr1[1] = new int[2];
        arr1[2] = new int[5];

        int[][] arr = new int[3][];
        arr[0] = new int[]{10, 20};
        arr[1] = new int[] {10, 20, 30};
    }
}
