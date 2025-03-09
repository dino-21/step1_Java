package part2.ch09.lab9_3;
package ch09;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections; // ArrayList를 무작위로 섞기 위해 불러옴

public class SimpleLotto {
	public static void main(String[] args) {
		// 로또 번호를 저장하는 ArrayList 생성
		ArrayList<Integer> lottoMachine = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) {
			lottoMachine.add(i); // 모든 로또 번호(1~45)를 ArrayList에 추가
		}

		// ArrayList의 순서를 무작위로 섞음 (로또 번호를 랜덤하게 선택하기 위해)
		Collections.shuffle(lottoMachine);
		
		// 로또 번호를 저장할 배열 생성
		int[] lottoNumArr = new int[6];
		
		// 6개의 로또 번호를 랜덤하게 뽑아서 배열에 저장
		for (int i = 0; i < lottoNumArr.length; i++) {
			lottoNumArr[i] = lottoMachine.get(i);
		}
		// 배열에 저장된 로또 번호를 문자열로 변환하여 출력
		String lottoNumStr = Arrays.toString(lottoNumArr);
		System.out.printf("자동 생성 로또 번호: %s", lottoNumStr);
	}
}


