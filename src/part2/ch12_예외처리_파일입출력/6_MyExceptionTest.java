package ch12;

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            // MyException 예외를 발생시킴
            throw new MyException("예외 발생시키기!!");
        } catch (MyException ex) {
            // MyException 예외를 처리하고 예외 메시지를 출력
            System.out.printf("예외 메시지: %s\n", ex.getMessage());
        }
    }
}

// MyException 클래스: Exception 클래스를 상속하여 사용자 정의 예외 정의
class MyException extends Exception {
    // 기본 생성자
    public MyException() {
        super("내가 만든 예외 발생"); // 기본 메시지 설정
    }

    // 매개변수가 있는 생성자
    public MyException(String message) {
        super(message); // 사용자 정의 메시지 설정
    }
}


/*
 *  MyException이라는 사용자 정의 예외 클래스를 정의하고,
 *  이를 사용하여 예외를 발생시키고 처리하는 방법을 보여준다.
 *  MyException 클래스는 Exception 클래스를 상속하여 사용자 정의 예외를 정의한다.
 *  MyException 클래스에는 기본 생성자와 매개변수가 있는 생성자가 있다.
 *  매개변수가 있는 생성자를 사용하여 예외 객체를 생성할 때 원하는 메시지를 설정할 수 있다.
 * 
 *  MyExceptionTest 클래스에서는 throw new MyException("예외 발생시키기!!") 코드를 사용하여 
 *  MyException 예외를 발생시킨다.
 *  catch (MyException ex) 블록에서는 발생한 MyException 예외를 처리하고, 
 *  ex.getMessage()를 사용하여 예외 메시지를 출력합한다.
 * 
 *  사용자 정의 예외 클래스를 만들고 예외를 발생시키고 처리하는 방법을 보여주고 있다.
 */
