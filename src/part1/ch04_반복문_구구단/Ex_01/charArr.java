package Ex_01;

public class charArr {

	public static void main(String[] args) {
		String str = "ABCD";
		char[] charArr = str.toCharArray(); // char[] charArr = {'A', 'B', 'C', 'D'};
		System.out.println("str: " + str);

		/*
		 * 배열을 직접 출력하면 배열의 주소값이 출력된다.배열이 객체로 취급되기 때문이다. 
		 * charArr 배열의 내용을 출력하려면 배열 요소를 하나씩 출력하거나, 배열을 문자열로 변환하여 출력해야 한다.
                        * 배열은 항상 for문과 같이 나온다. 
		 */
		System.out.println("charArr : " + charArr);

		// 배열 요소를 하나씩 출력
		System.out.print("charArr: ");
		for (char c : charArr) {
			System.out.print(c + " ");
		}
		System.out.println(); // 개행 문자를 출력하여 줄을 바꾼다.
	}

}
