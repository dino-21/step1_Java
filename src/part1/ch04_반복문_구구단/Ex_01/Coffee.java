package Ex_01;

public class Coffee {

	public static void main(String[] args) {
		int[] sales = new int[5];
		
		sales[0] = 30;  //월
		sales[1] = 40;  //화
		sales[2] = 55;  //수
		sales[3] = 42;  //목
		sales[4] = 38;  //금
		
		int sum = sales[0]+sales[1]+sales[2]+sales[3]+sales[4];
		System.out.printf("총 판매량은 : %d잔", sum);

	}

}
