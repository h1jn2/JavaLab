package ch2.section1;

public class Exam4 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;   // int -> double 암시적 캐스팅
//        int a2 = b;     // error
        int a2 = (int)b;    // double -> int 명시적 캐스팅

        double d = 12.94;
        int a3 = (int)d;    // 캐스팅 하면서 소수점 버림
        System.out.println(a3);

        // char 도 정수로 표현될 수 있음
        char c = 'A';
        int a4 = c;     // ascii 코드로 변환: 각 문자에 해당하는 정수값
        System.out.println(a4);

        String str = "10";
        int intData = Integer.parseInt(str);
        String str2 = String.valueOf(intData);
        System.out.println((str + 10) + ", " + (intData + 10));
    }
}
