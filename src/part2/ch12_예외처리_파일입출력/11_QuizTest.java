package part2.ch12.lab12_1;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		 // 퀴즈 객체 생성
        Quiz myQuiz = new Quiz("다음 중 과일이 아닌 것은? 1: 사과 2: 젤리", 2);
        String result = "퀴즈가 정상 수행되지 않았습니다.";
        
        try {
        	// 퀴즈를 풀고 결과를 확인
            result = myQuiz.play() ? "정답입니다" : "오답입니다";
        } catch (QuizException ex) {
            System.out.printf("예외 발생! %s\n", ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.printf("예외 발생! %s\n", ex.getMessage());
        } finally {
        	// 결과 출력
            System.out.println(result);
        }
    }
}

class Quiz {
    private String question; // 퀴즈 질문
    private int answer;  // 정답
    private static final Scanner scanner = new Scanner(System.in);

    public Quiz(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean play() throws QuizException {
        System.out.println(question);
        System.out.print("정답을 입력하시오: ");
        String inputStr = scanner.next();
        int inputNum = Integer.parseInt(inputStr);
        if (!(inputNum == 1 || inputNum == 2)) {
            throw new QuizException("보기에 없는 값을 입력하였습니다.");
        }
        return (answer == inputNum) ? true : false;
    }
}

class QuizException extends Exception { // 사용자 정의 예외
    public QuizException(String message) {
        super(message);
    }
}

/*
 * 퀴즈를 푸는 간단한 Java 프로그램으로, 예외 처리를 통해 잘못된 입력 및 예외 상황을 처리하고 결과를 출력
 * QuizTest 클래스의 main 메서드에서는 퀴즈 객체(myQuiz)를 생성하고, 퀴즈를 풀어서 결과를 확인한다.
 * Quiz 클래스는 퀴즈 관련 정보와 로직을 포함하고 있습니다. 퀴즈의 질문과 정답을 생성자를 통해 설정한다.
 * play 메서드는 퀴즈를 푸는 메서드로, 사용자에게 질문을 출력하고 정답을 입력받는다. 
 * 입력된 값이 정수가 아니면 NumberFormatException을 던진다.
 * 사용자가 입력한 값이 1 또는 2가 아니면 사용자 정의 예외인 QuizException을 던진다.
 * QuizException 클래스는 사용자 정의 예외로, 예외 메시지를 설정할 수 있다.
 * finally 블록에서는 퀴즈의 결과를 출력한다.
 */
