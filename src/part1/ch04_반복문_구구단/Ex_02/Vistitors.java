package Ex_02;

public class Vistitors {

	public static void main(String[] args) {
		// 한 주간 오픈마켓(ex쿠팡) 사이트의 접속자 수는 도시마다 다음과 같다고 가정한다.
		String[] cities = { "서울", "부산", "인천", "대전", "대구" };
		int[] visitCount = { 599, 51, 46, 43, 27 };

		// 결과 출력
		for (int i = 0; i < cities.length; i++) {
			System.out.printf("%s: %d명\n", cities[i], visitCount[i]);
		}
	}

}
