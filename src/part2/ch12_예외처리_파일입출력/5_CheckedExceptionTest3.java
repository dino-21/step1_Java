package ch12;

public class CheckedExceptionTest {
    public static void main(String[] args) {
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
 *  try 블록 안에 Thread.sleep(1000) 메서드를 두고, 
 *  이 메서드를 호출할 때 InterruptedException이 발생할 수 있으므로 
 *  catch 블록을 사용하여 이 예외를 처리한다.
 *  InterruptedException은 스레드가 sleep 중에 다른 스레드에 의해 인터럽트되는 경우 발생하는 예외이다.
 *  catch 블록에서는 이 예외가 발생했을 때의 처리를 수행하고, 예외 메시지를 출력한다. 
 *  이렇게 함으로써 예외가 발생하더라도 프로그램이 종료되지 않고 계속 실행된다.
 */