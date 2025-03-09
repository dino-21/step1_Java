package part2.ch12.ex12_7;
package ch12;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            // aaa() 메소드 호출
            aaa();
        } catch (MyException ex) {
            // MyException 예외를 처리하고 예외 정보를 출력
            ex.printStackTrace();
        }
    }

    // aaa() 메소드는 MyException을 throws 함
    private static void aaa() throws MyException {
        System.out.println("aaa() 메소드가 호출되었습니다.");
        // bbb() 메소드 호출
        bbb();
    }

    // bbb() 메소드는 MyException을 throws 함
    private static void bbb() throws MyException {
        System.out.println("bbb() 메소드가 호출되었습니다.");
        // MyException 예외를 발생시킴
        throw new MyException("bbb()에서 예외 발생");
    }
}

// MyException 클래스: Exception 클래스를 상속하여 사용자 정의 예외 정의
class MyException extends Exception {
    // 생성자에서 예외 메시지를 받아 설정
    public MyException(String message) {
        super(message);
    }
}


/*
 * 1 main 메서드가 시작되고, aaa() 메서드를 호출합니다.
 * 2 aaa() 메서드는 bbb() 메서드를 호출합니다.
 * 3 bbb() 메서드는 실행 도중 MyException 예외를 발생시킵니다.
 * 4 예외가 발생하면, bbb() 메서드는 종료되고, 이 예외는 aaa() 메서드로 전달됩니다.
 * 5 aaa() 메서드 또한 예외를 처리하지 않기 때문에 main 메서드로 예외가 다시 전달됩니다.
 * 6 main 메서드에서 이 예외를 catch 블록에서 잡아, 예외의 스택 추적 정보를 출력합니다.

 * ThrowsTest 클래스의 main 메소드에서 aaa() 메소드를 호출하고, aaa() 메소드에서 bbb() 메소드를 호출한다.
 * bbb() 메소드에서는 throw new MyException("bbb()에서 예외 발생") 코드를 사용하여 MyException 예외를 발생시킨다.
 * aaa() 메소드와 bbb() 메소드에서는 throws MyException을 선언하여, 
 * 이 메소드들에서 발생할 수 있는 MyException 예외를 호출한 곳으로 예외를 넘기고 있다.
 * main 메소드에서는 try-catch 블록을 사용하여 MyException 예외를 처리하고, 예외 정보를 출력하도록 한다.
 * 이렇게 함으로써 메소드 간 예외를 처리하고, 예외가 발생하면 호출 스택을 따라 상위 메소드로 예외를 전파하는 방법을 보여주고 있다.
 * 
 * 예외를 떠넘기는 이유
 * 1 예외 정보 로깅 : 예외를 떠넘기면 해당 예외가 어디에서 발생했는지에 대한 정보를 기록하고 로깅할 수 있다. 
 *  이는 디버깅과 모니터링에 도움이 된다.
 * 2 예외 전파: 메소드에서 발생한 예외를 상위 호출자로 전파하여 예외 처리를 해당 호출자에게 맡길 수 있다. 
 *   상위 호출자에서 예외 처리 로직을 작성하거나, 예외를 더 높은 수준에서 처리할 수 있다.
 * 3 예외 처리 분리: 메소드 내부에서 예외를 처리하면 해당 메소드의 기능과 예외 처리가 혼재되어 가독성이 떨어질 수 있다. 
 *   예외를 떠넘김으로써 메소드의 주요 로직과 예외 처리를 분리할 수 있다.
 */


