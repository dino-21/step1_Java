package part2.ch12.ex12_9;


import java.io.*; // 파일, 파일리더, 입출력 예외 처리 클래스 등을 불러옴

public class BankAccountTest {
    public static void main(String[] args) throws IOException {
        // 두 개의 은행 계좌 객체를 생성
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000005);
        BankAccount b = new BankAccount("워런 버핏", "206-000002", 1000037);

        // 계좌 정보를 저장할 파일 객체 생성
        File file = new File("accounts-data.txt");

        // FileWriter를 사용하여 파일에 데이터를 쓰기 위해 열기
        FileWriter fw = new FileWriter(file);

        // 계좌 정보를 파일에 쓰기
        fw.write(a.toString() + "\n");
        fw.write(b.toString() + "\n");

        // 파일 닫기
        fw.close();
    }
}

class BankAccount {
    private final String username; // 고객명
    private final String number; // 계좌번호
    private int amount; // 잔액

    public BankAccount(String username, String number, int amount) {
        this.username = username;
        this.number = number;
        this.amount = amount;
    }

    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);
    }
}


/**
 * 파일을 저장 src 폴더옆에 accounts-data.txt로 영구저장
 * 파일입출력IO
 */