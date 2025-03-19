package ch2.section3;

public class Quiz1 {
    public static void main(String[] args) {
        int[] arr = {76, 92, 49, 78, 83};
        int sum = 0;
        int avg = 0;
        int max = arr[0];
        int min = arr[0];

        for (int num: arr) {
            sum += num;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        avg = sum / arr.length;
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + avg);
    }
}
