package ch12;

public class CheckedExceptionTest {
	public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", i);
            
            try {
                // Thread.sleep(1000) 메서드는 InterruptedException을 발생시킬 수 있음
                Thread.sleep(1000); // 1.000초간 실행을 멈춤
            } catch (InterruptedException e) {
                // InterruptedException이 발생했을 때의 처리
                System.out.println("InterruptedException 발생: " + e.getMessage());
            }
        }
    }
}


/*
 * main 메서드 선언부에 throws InterruptedException을 추가하여, 
 * main 메서드 내부에서 발생할 수 있는 InterruptedException 예외를 처리하지 않고 
 * 이를 호출한 곳으로 예외를 넘기는 것을 나타낸다.
 * main 메서드에서는 이 예외를 try-catch 블록으로 처리하는 대신, 
 * 예외를 throws하여 호출한 곳에서 처리하도록 하였다.
 * 이렇게 하면 main 메서드를 호출하는 코드에서 예외 처리를 수행하거나, 
 * 또는 상위 메서드에서 예외를 처리해야 한다.
 */