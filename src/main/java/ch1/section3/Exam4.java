package ch1.section3;

/**
 * document 를 위한 주석
 * 이 클래스가 왜 작성된 것인지
 * 어떤 역할의 클래스인지
 * 누가 언제 작성했는지
 */

public class Exam4 {
    int a = 10;
//    int b = 10;
    public int c = 10;

    /**
     * 이 함수는 로그인을 처리하기 위한 함수입니다.
     */
    public void some1() {}

    /*
    void some2() {
    }
     */

    public static void main(String[] args) {
        System.out.println("주석 테스트 입니다");
    }
}

// 개발이 완료된 후에 javadoc.exe 를 이용해서 doc 파일을 만듬
// javadoc 명령은 .java 파일이 있는 곳에서 사용 (.class 아님)
// document 문서에는 public 만 출력됨
// javadoc -d C:\Users\dksgu\Desktop\doc Exam4.java -encoding UTF-8 -charset UTF-8 -docencoding UTF-8