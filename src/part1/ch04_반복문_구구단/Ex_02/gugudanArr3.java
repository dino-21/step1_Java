package Ex_02;

public class gugudanArr3 {

	public static void main(String[] args) {

		int[][] gugudan = new int[10][10]; // 이차원 배열의 공간할당

		// 2차원 배열을 표로 출력
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d][%d] ", i, j);
			}
			System.out.println(); // 각 행의 끝에서 줄 바꿈
		}

		System.out.println("--------------------------------------------------------------------------");

		// 2차원 배열을 표로 출력
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudan[i][j] = i * j; // // 2차원 배열에 구구단 결과 저장
				System.out.printf("[%d][%d] = %2d  ", i, j, gugudan[i][j]);
			}
			System.out.println(); // 각 행의 끝에서 줄 바꿈
		}

	}

}
