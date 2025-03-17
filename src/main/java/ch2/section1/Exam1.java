package ch2.section1;

// 식별자, 예약어 테스트
public class Exam1 {
    int count = 0;
    int count1 = 10;
    // 식별자에 사용할 수 있는 특수문자는 _, $
    int count_data = 10;
    int count$data = 10;
    // 원한다면 각국 언어도 가능
    int 카운트 = 10;


//    // 식별자 첫 글자로 숫자 불가능
//    int 1count = 10;
//    // 허용하지 않는 특수문자
//    int count-1 = 10;
//    // 공백 불가
//    int count data = 10;
//    // 예약어 사용 불가능
//    int final = 10;

    public static void main(String[] args) {
        Exam1 객체 = new Exam1();
        객체.카운트 = 20;
        System.out.println(객체.카운트);
    }
}
