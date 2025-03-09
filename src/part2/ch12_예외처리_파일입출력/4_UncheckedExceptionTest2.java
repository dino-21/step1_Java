package ch12;

import java.util.ArrayList;

public class UncheckedExceptionTest {
	 public static void main(String[] args) {
	        ArrayList<String> names = null;


	        try {
	            // names가 null인 상태에서 add 메서드 호출 시 NullPointerException 발생
	            names.add("Park");
	        } catch (NullPointerException e) {
	            // NullPointerException이 발생했을 때의 처리
	            System.out.println("NullPointerException 발생: " + e.getMessage());
	        }
	    }
}


/*
 * try-catch 블록을 사용하여 names가 null일 때 발생하는 NullPointerException을 잡아내고, 
 * 예외 발생 시 처리 메시지를 출력하도록 하였다. 
 * 이렇게 하면 프로그램이 예외를 처리하고 종료되지 않고 계속 실행될 수 있다.
 * 
 */