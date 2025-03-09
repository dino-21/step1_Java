package Ex_01;

public class Coffee2 {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 8, 13, 15, 17, 32 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.printf("총합 : %d", sum);
	}

}
