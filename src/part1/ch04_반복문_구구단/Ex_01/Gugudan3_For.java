package Ex_01;

public class Gugudan3_For {

	public static void main(String[] args) {
		
		int dan = 3;
		System.out.println(dan + "단 출력");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}

	}

}
