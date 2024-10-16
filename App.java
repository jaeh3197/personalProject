package report;

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

        //반복문 구현
        //answer 이 exit 와 같지 않으면 true, while 문 반복
        //answer 이 exit 와 같다면 false, while 문 종료
        while (!(Objects.equals(answer, "exit"))) {
            System.out.println("첫 번째 숫자를 입력해주세요: ");
            int firstNum = sc.nextInt();    //첫 번째 변수 입력

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();    //연산자 입력

            System.out.println("두 번째 숫자를 입력해주세요: ");
            int secondNum = sc.nextInt();   //두 번째 변수 입력

            //Calculator 에서 계산된 결과값을 저장하기 위한 변수 선언
            int result = calculator.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);
            calculator.getResults().add(result);     //Calculator 의 연산 결과를 저장하는 list 에 저장

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.next();
            if (Objects.equals(answer, "remove")) {
                calculator.removeResults();
            }
        }
        System.out.println(calculator.getResults());
    }
}
