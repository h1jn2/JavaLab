package ch4.section1_lang;

public class Exam3 {
    public static void main(String[] args) {
        // 기초 타입의 데이터가 객체로 이용돼야 하는 경우
//        Object[] objArr = {
//                new Integer(10),
//                new Boolean(true),
//                new Double(10.0);
//        };

        // 원래는 위처럼 사용해야 하는데 편의성을 위해 마치 값을 직접 준 것 처럼
        // 사용할 수 있고 내부적으로는 객체가 만들어져서 들어감
        Object[] objArr2 = {
                10, true, 10.0
        };
    }
}

