package Ex_01;

public class Gugudan5_While {

	public static void main(String[] args) {

		int dan = 5;
		System.out.println(dan + "단 출력");
		int i = 1;
		while (i <= 9) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			i++;
		}

	}

}
