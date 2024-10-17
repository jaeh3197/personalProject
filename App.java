package report;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Calculator 인스턴스 생성
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        //스캐너 생성
        Scanner sc = new Scanner(System.in);

        //변수 선언
        String answer = null;
        double firstNum = 0;
        double secondNum = 0;
        double result = 0;
        String operator = null;


        //반복문 구현
        //answer 이 exit 와 같지 않으면 true, while 문 반복
        //answer 이 exit 와 같다면 false, while 문 종료
        while (!(Objects.equals(answer, "exit"))) {
            //올바른 타입을 입력할때까지 반복
            while (true) {
                //입력 시 타입과 다를 경우 예외처리
                try {
                    System.out.println("첫 번째 숫자를 입력해주세요: ");    //첫 번째 변수 입력
                    firstNum = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("잘못 입력하였습니다.");
                }
            }

            while (true) {
                System.out.println("사칙연산 기호를 입력하세요: ");     //연산자 입력
                operator = sc.next();
                //사칙연산 기호를 제외 한 나머지 문자 입력 시 다시 입력
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    break;
                } else {
                    System.out.println("잘못 입력하였습니다.");
                }
            }

            while (true) {
                try {
                    System.out.println("두 번째 숫자를 입력해주세요: ");    //두 번째 변수 입력
                    secondNum = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("잘못 입력하였습니다.");
                }
            }

            //Calculator 에서 계산된 결과값을 result 에 저장
            result = calculator.calculate(firstNum, secondNum, operator);

            System.out.println("결과: " + result);
            calculator.getResults().add(result);     //Calculator 의 result 값들을 results list 에 저장

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            //연산 후 입력 값을 answer 에 저장 하여 list 삭제 메소드를 호출 할지 반복문을 끝낼지 결정
            answer = sc.next();
            if (Objects.equals(answer, "remove")) {
                calculator.removeResults();
            }
        }
        System.out.println(calculator.getResults());
    }
}
