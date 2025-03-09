package part2.ch09.lab9_1;

//Random 클래스를 사용하기 위한 import 문
import java.util.Random;

public class DiceTest {
	public static void main(String[] args) {
		Dice diceA = new Dice(6); // 6면 주사위 객체 생성
		Dice diceB = new Dice(6); // 6면 주사위 객체 생성

		// 두 주사위 A와 B의 합을 기록할 배열, 인덱스 범위(0~12)
		int[] counts = new int[13]; // 크기 13의 정수 배열을 생성하여 주사위 합을 기록

		// 두 주사위의 합을 기록, 100회 반복
		for (int n = 0; n < 100; n++) {  // 100번의 시뮬레이션
			int a = diceA.roll(); // 주사위 A를 굴려서 나온 숫자
			int b = diceB.roll(); // 주사위 B를 굴려서 나온 숫자
			int sum = a + b; // 두 주사위의 합
			counts[sum]++; // 해당 합의 빈도수를 증가시킴
		}

		// 결과 출력
		for (int i = 2; i < counts.length; i++) { // 합계 2부터 12까지 순회
			System.out.printf("%2d: %d\n", i, counts[i]); // 합과 빈도수를 출력
		}
	}
}

class Dice {
	private int sides; // 주사위 면의 개수
	private static Random rand = new Random();  // Dice가 공유할 Random 객체

	public Dice(int _sides) {
		sides = _sides;  // 주사위 면의 개수를 초기화
	}

	public int roll() {
		// Random 객체로 임의의 정수를 생성, 주사위 면의 개수를 기준으로 함
		return rand.nextInt(sides) + 1;  // 1부터 sides까지의 랜덤한 숫자 반환
	}
}



/*
 * Dice 클래스는 주사위를 나타내며, 주사위는 여러 면을 가질 수 있습니다. 예를 들어, 6면 주사위를 만들 수 있다.
 * DiceTest 클래스는 실제로 주사위를 던지고 결과를 기록하고 출력하는 역할을 한다.
 * 주사위를 100번 던져서 나오는 두 주사위의 눈금을 합한 값을 기록한다.
 * 이 합계 값들을 특정한 숫자(2부터 12까지)와 그 빈도수로 출력한다. 
 * 예를 들어, 2가 나오는 횟수, 3이 나오는 횟수, ..., 12가 나오는 횟수를 출력한.
 * 두 주사위를 던져서 나오는 각각의 합이 얼마나 자주 나오는지를 알 수 있다.
 * 합계를 2부터 시작하는 이유는 주사위의 결과 값이 1부터 시작하기 때문
 * 각 주사위는 1부터 6까지의 눈금을 가지고 있으며, 두 주사위의 합계는 최소 2(1+1)이 되고, 최대 12(6+6)까지가 가능
 * rand.nextInt(sides) + 1; sides 값이 6이면, rand.nextInt(6)은 0부터 5까지의 임의의 정수를 생성하고, 
 * 이에 1을 더하면 주사위의 눈금(1부터 6까지)을 얻게 된다.
*/
