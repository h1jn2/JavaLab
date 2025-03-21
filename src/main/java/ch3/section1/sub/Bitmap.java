package ch3.section1.sub;

// Bitmap 과 Builder 를 개발자가 만든 패키지
// 이 Bitmap 을 이용하는 코드와 다른 패키지

// 외부 패키지에서 이용해야하기 때문에 public 으로 선언
// 단, new Bitmap()이 안 되도록
public class Bitmap {
    public int data = 0;

    // 생성자를 default 로 지정하여 이 패키지 내에서만 접근 가능하도록
    // 왜부에서는 생성할 수 없음
    Bitmap() {}
}
