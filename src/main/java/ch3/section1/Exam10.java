package ch3.section1;

import ch3.section1.sub.Bitmap;
import ch3.section1.sub.Builder;

// builder pattern
public class Exam10 {
    public static void main(String[] args) {
//        Bitmap bitmap = new Bitmap();   // error 직접 생성 불가능
        Builder builder = new Builder();
        Bitmap bitmap = builder.createBitmap();
        Bitmap bitmap1 = builder.createBitmap();
    }
}
