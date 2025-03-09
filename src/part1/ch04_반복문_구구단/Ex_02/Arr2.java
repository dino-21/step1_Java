package Ex_02;

public class Arr2 {

	public static void main(String[] args) {

		// 이차원배열
		int[] row1 = { 1, 2, 3, 4 };  //1차원배열
		int[] row2 = { 5, 6, 7, 8 };   //1차원배열
		int[][] matrix = { row1, row2 };  // 2차원 배열
		
		// System.out.println(matrix); 주소값이 나옴, 열의 내용을 보고 싶으면 반복문을 사용하여 각 요소를 개별적으로 출력해야 함
		
		// 배열의 내용을 출력하기 위한 반복문
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); // 각 행의 끝에서 줄 바꿈
		}

	}

}
