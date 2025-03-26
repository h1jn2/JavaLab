package ch4.section1_lang;

public class Exam2 {
    public static void main(String[] args) {
        // String equals
        String str1 = "hello";
        String str2 = "hello";
        // str1과 str2는 같은 메모리 주소
        String str3 = new String("hello");
        String str4 = new String("hello");

        // 기초 타입의 == 은 값 비교
        // 객체 타입의 == 은 객체 비교
        // new 를 사용하여 정식으로 객체를 생성하면 메모리 할당이 됨
        // String 을 마치 기초 타입처럼 사용하면 객체를 생성하긴 하지만
        // 이후 동일한 데이터로 다시 선언하면 그 데이터를 가지는 객체가 이미 있는 지
        // 확인한 후 있으면 그 메모리를 그대로 이용, 없으면 생성
        System.out.println(str1 == str2);   // true
        System.out.println(str1 == str3);   // false
        System.out.println(str3 == str4);   // false

        // 객체의 equals 는 주소값 비교
        // String 의 equals 는 값 비교 (String 에서 오버라이드함)
        // String 의 값 비교를 할 때 == 를 사용하면 신경써야 함
        // 되도록이면 String 에선 equals 사용
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.equals(str3));  // true
        System.out.println(str3.equals(str4));  // true

        str1 += "world";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        // StringBuffer 는 동일 객체의 값이 변경
        // 값이 자주 바뀔 땐 StringBuffer 가 효율적
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.hashCode());
        sb.append("world");
        System.out.println(sb.hashCode());


    }
}
