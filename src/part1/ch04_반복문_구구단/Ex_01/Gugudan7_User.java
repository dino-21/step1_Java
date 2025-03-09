package Ex_01;

import java.util.Scanner;

public class Gugudan7_User {

	public static void main(String[] args) {
		System.out.println("숫자를 쓰세요 구구단출력:");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		System.out.println(dan + "단 출력");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}

	}

}
