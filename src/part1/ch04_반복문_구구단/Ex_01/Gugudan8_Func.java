package Ex_01;

public class Gugudan8_Func {

	public static void main(String[] args) {

		int dan = 8;
		System.out.println(dan + "단 출력");
		
		gugudan(dan);
		
		gugudan(11);

	}
	
	public static void  gugudan(int ele){
		
		int i = 1;
		while (i <= 9) {
			System.out.printf("%d X %d = %d\n", ele, i, ele * i);
			i++;
		}
	}

}
