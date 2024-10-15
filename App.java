package report;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수 선언
        int result = 0;
        String answer = null;

        //반복문 구현
        //answer 이 exit 와 같지 않으면 true, while 문 반복
        //answer 이 exit 와 같다면 false, while 문 종료
        while (!(Objects.equals(answer, "exit"))) {
            System.out.println("첫 번째 숫자를 입력해주세요: ");
            int firstNum = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            System.out.println("두 번째 숫자를 입력해주세요: ");
            int secondNum = sc.nextInt();

            //제어문 구현
            //숫자에 음수를 입력할 경우 오류 출력
            //나눗셈 연산에서 분모에 0이 올 경우 오류 출력
            if (firstNum >= 0 && secondNum >= 0) {
                if (operator == '+') {
                    result = firstNum + secondNum;
                } else if (operator == '-') {
                    result = firstNum - secondNum;
                } else if (operator == '*') {
                    result = firstNum * secondNum;
                } else if (operator == '/' && secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else if (operator == '/') {
                    result = firstNum / secondNum;
                }
                System.out.println("결과: " + result);
            } else {
                System.out.println("음수는 입력할 수 없습니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.next();
        }
    }
}
