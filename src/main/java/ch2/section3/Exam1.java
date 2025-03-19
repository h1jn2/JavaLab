package ch2.section3;

// 배열 변수 선언

public class Exam1 {
    public static void main(String[] args) {
        // 선언 방법 1

        // 변수의 메모리에 실제 데이터 (primitive type)
        int score = 30;
        // 초기화는 실제 데이터를 담는 것이 아니라 데이터를 담을 수 있는 메모리 확보
        // 배열 변수는 꼭 사이즈를 초기화 (메모리 확보)하고 사용해야 함
        // 배열 변수에 저장된 것은 실제 데이터가 아니라 확보한 메모리의 주소값
        // 주소값을 가지는 변수 (reference 변수)
        int[] scores = new int[5];
        int scores1[] = new int[5];

        System.out.println("primitive type: " + score); // primitive type: 30
        System.out.println("reference type: " + scores);// reference type: [I@13221655

        scores[0] = 10;
        scores[1] = 20;
        System.out.println(scores[0]);  // 10
        System.out.println(scores[1]);  // 20
        System.out.println(scores[2]);  // 0

//        scores[5] = 10;   // error

        // 선언 방법 2

        int[] scores2 = {10, 20, 30};

        int[] scores3;
//        score3 = {10, 20, 30};    // error    선언과 동시에 데이터 지정해야함
        scores3 = new int[3];

    }
}
