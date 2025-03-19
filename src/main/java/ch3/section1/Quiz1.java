package ch3.section1;

class Member {
    int memberId;
    String name;
    String email;
    String password;
    String phoneNumber;

    Member() {
        memberId = 0;
        name = "name";
        email = "abc123@email.com";
        password = "abc123";
        phoneNumber = "000-0000-0000";
    }
    Member(int memberId, String name, String email, String password, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    boolean register() {
        System.out.println("register() 호출");
        return false;
    }

    boolean login() {
        System.out.println("login() 호출");
        return false;
    }

    boolean logout() {
        System.out.println("logout() 호출");
        return false;
    }

    String getInfo() {
        String info = "memberId: " + memberId + ", name:" + name + ", email: "
                + email + ", password: " + password + ", phoneNumber: " + phoneNumber;

        return info;
    }
}
public class Quiz1 {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member(1, "abc", "email", "pw", "num");

        System.out.println(member1.getInfo());
        System.out.println(member2.getInfo());

        member1.register();
        member1.login();
        member1.logout();
    }
}
