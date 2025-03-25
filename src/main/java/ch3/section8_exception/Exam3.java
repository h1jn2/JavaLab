package ch3.section8_exception;

// 은행 시스템을 가정했을 때, 예금 인출, 입금이 진행
// 입금이 0보다 작은 수가 들어오거나 출금이 잔고보다 큰 수가 들어올 때
// java 적으로 예외 상황은 아니지만 앱에서 존재할 수 없는 상황으로 보고
// custom exception 으로 처리해서 예외처리 코드에 의해 개발되게 하고싶다면

class BadBankingException extends Exception {
    BadBankingException(String s) {
        super(s);
    }
}

// 통장을 추상화 시킨 클래스
class BankAccount {
    private String name;
    private int number;
    private int balance;

    BankAccount(String name, int number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    // 출금 요청
    void withDraw(int amt) throws BadBankingException{
        if (amt > balance) {
            throw new BadBankingException("잔액 부족");
        }
        balance = balance - amt;
    }

    void deposit(int amt) throws BadBankingException {
        if (amt < 0) {
            throw new BadBankingException("0보다 작은 금액 입금 요청");
        }
        balance = balance + amt;
    }
}
public class Exam3 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("홍길동", 1, 1000);

        try {
            myAccount.withDraw(3000);
        } catch (BadBankingException e) {
            System.out.println(e);
        }
    }
}
