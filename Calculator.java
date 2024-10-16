package report;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public List<Integer> results = new ArrayList<>();

    public int calculate(int firstNum, int secondNum, char operator) {

        int result = 0;

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
        }
        return result;
    }
}
