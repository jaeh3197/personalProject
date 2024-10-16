package report;

import java.util.Arrays;
import java.util.function.BiFunction;

//Enum 클래스 선언
public enum OperatorType {
    //열거할 상수들을 정의
    PLUS("+", (firstNum, secondNum) -> firstNum + secondNum),
    MINUS("-", (firstNum, secondNum) -> firstNum - secondNum),
    MULTIPLY("*", (firstNum, secondNum) -> firstNum * secondNum),
    DIVIDE("/", (firstNum, secondNum) -> firstNum / secondNum);

    //열거한 상수들을 담을 operator 변수 선언
    private String operator;
    private BiFunction<Integer, Integer, Integer> expression;

    OperatorType(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    //받아온 변수들을 적용
    public static int calculate(String operator, int firstNum, int secondNum) {
        return getOperatorType(operator).expression.apply(firstNum, secondNum);
    }

    //private 으로 선언된 변수를 가져오기 위해 Getter 사용
    private static OperatorType getOperatorType(String operator) {
        return Arrays.stream(values())
                .filter(op -> op.operator.equals(operator))
                .findFirst().orElse(null);
    }
}
