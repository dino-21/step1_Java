package part2.ch12.ex12_10;

//파일, 파일리더, 입출력 예외 처리 클래스 등을 불러옴
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BankAccountTest {
	public static void main(String[] args) throws IOException {
		File file = new File("accounts-data.txt");
		// 현재 작업 디렉토리 확인
		System.out.println(System.getProperty("user.dir"));

		FileReader fr = new FileReader(file); // 파일 리더를 생성하여 파일을 읽기 위해 열기

		int ch;

		// 파일에서 문자를 읽어와 출력
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
			// Thread.sleep(200); // 주석 처리된 부분: 200 밀리초마다 쉬는 부분
		}

		fr.close(); // 파일 리더 닫기
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

/*
 * Input/Output의 약어로, 입출력 작업 여기서 "I"는 Input(입력), "O"는 Output(출력)을 나타낸다. 
 * 입출력 작업은 컴퓨터 프로그램이 데이터를 읽어들이는 것(입력)과 데이터를 기록하거나 다른 시스템에 전송하는 것(출력)을 포함한다. 
 * Input (입력): 입력은 프로그램이 외부 데이터 소스에서 데이터를 읽어 들이는 작업을 나타냅니다. 
 * Output (출력): 출력은 프로그램이 데이터를 외부로 내보내거나 표시하는 작업을 나타냅니다. 
 * 
 * accounts-data.txt 파일을 읽어와서 화면에 결과를 출력
 * 키보드 입력을 읽는 것은 Input 작업이며, 화면에 결과를 출력하는 것은 Output 작업이다. 
 * 
 */