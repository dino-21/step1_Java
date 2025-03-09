package part2.ch12.ex12_8;

public class BankAccountTest {
    public static void main(String[] args) {
        // 두 개의 은행 계좌 객체 생성
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워런 버핏", "206-000002", 1000000);

        // 계좌 정보를 출력
        System.out.println(a.toString()); // 첫 번째 계좌 정보 출력
        System.out.println(b.toString()); // 두 번째 계좌 정보 출력
    }
}

// 은행 계좌 정보를 나타내는 클래스
class BankAccount {
    private final String username; // 고객명
    private final String number; // 계좌번호
    private int amount; // 잔액

    // 생성자: 고객명, 계좌번호, 초기 잔액을 받아 계좌 객체 초기화
    public BankAccount(String username, String number, int amount) {
        this.username = username;
        this.number = number;
        this.amount = amount;
    }

    // 계좌 정보를 문자열로 반환하는 메서드
    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);
    }
}