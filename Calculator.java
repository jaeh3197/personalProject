package report;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //연산 결과를 저장하는 list 선언 및 생성
    public List<Integer> results = new ArrayList<>();

    //매개변수를 설정하고 App에 있던 연산 메서드를 가져옴
    public int calculate(int firstNum, int secondNum, char operator) {

        //결과값을 저장하기 위한 변수 선언
        int result = 0;

        //입렵 받은 연산을 수행하기 위한 if문
        if (firstNum >= 0 && secondNum >= 0) {
            if (operator == '+') {
                result = firstNum + secondNum;
            } else if (operator == '-') {
                result = firstNum - secondNum;
            } else if (operator == '*') {
                result = firstNum * secondNum;
            } else if (operator == '/' && secondNum == 0) {     //나누기 연산에서 분모에 0일 올 경우 정제된 문자열 출력
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else if (operator == '/') {
                result = firstNum / secondNum;
            }
        }
        return result;
    }
}
