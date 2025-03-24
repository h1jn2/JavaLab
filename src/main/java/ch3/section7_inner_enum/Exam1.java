package ch3.section7_inner_enum;

class OuterClass {
    int outerData = 10;
    private int outerData2 = 20;

    // inner class 로 선언되긴 했지만 컴파일 시키면 독립 class 나옴
    // outer 의 private 멤버로 접근할 수 있었던 이유
    // 컴파일러가 public 함수를 만들어주고 그 함수를 이용해서
    // private 를 이용하는 코드로 바꿔줌
    class InnerClass {
        int innerData = 20;

        void innerFun() {
            innerData++;
            outerData++;
            outerData2++;
        }
    }

    static class StaticInnerClass {
        void innerFun() {
        }

    }
}

class Super {
    void superFun() {
    }
}

interface MyInterface {
    void interfaceFun();
}

public class Exam1 {
    static void some(MyInterface obj) {
        obj.interfaceFun();
    }
    public static void main(String[] args) {
        System.out.println("hello");
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass obj = outerClass.new InnerClass();
        obj.innerData++;

        OuterClass.StaticInnerClass outer = new OuterClass.StaticInnerClass();

        // 익명 클래스는 선언과 동시에 객체 생성해야 함
        new Super() {
            @Override
            void superFun() {
                super.superFun();
            }
        };

        new MyInterface() {
            @Override
            public void interfaceFun() {

            }
        };

        some(new MyInterface() {
            @Override
            public void interfaceFun() {

            }
        });
    }
}
