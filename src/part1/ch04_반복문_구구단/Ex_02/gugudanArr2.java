package Ex_02;

public class gugudanArr2 {

	public static void main(String[] args) {

		int[][] gugudan = new int[10][10]; // 이차원 배열의 공간할당

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) { // 변수 j를 증가시켜야 합니다.
				gugudan[i][j] = i * j;
			}
		}
		System.out.printf("2 X 7 = %d\n", gugudan[2][7]);
		System.out.printf("9 X 4 = %d\n", gugudan[9][4]);

		System.out.println("-------------------");
		// 구구단 결과를 모두 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\n", i, j, gugudan[i][j]);
            }
        }
        
    	System.out.println("-------------------");
        // 2차원 배열을 표로 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %2d  ", i, j, gugudan[i][j]);  // %2d   폭이 2자리되도록 왼쪽공백추가 
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
	}

}
