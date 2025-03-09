package Ex_01;

public class charArr2 {

	public static void main(String[] args) {
		char ch = 'A';
		// char ch2 = 'ABC' //ERROR char타입은 오직 한글자만 저장할 수 있다.

		String str = "Programming is fun! Right?";
		char[] charArr = str.toCharArray(); // 문자열 str을 문자의 배열로 변환
		int count = 0;

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == 'R' || charArr[i] == 'r') {  // 문자의 배열을 순회하며 R또는 r을 찾음
				count++;
			}
		}
		System.out.println(str);
		System.out.printf("=> R(r)의 개수 : %d", count);

	}

}
