import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class Utils {

    public static Stack<String> convertStringToStack(String expression) {
        Stack<String> expressionStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            String nextValue = String.valueOf(expression.charAt(i));

            if (!(isArithmeticOperation(nextValue) || isDigit(nextValue))) {
                throw new RuntimeException("Invalid character: \"" + nextValue + " \" is not a number or a arithmetic expression");
            }

            if (!expressionStack.isEmpty()) {

                if (isDigit(nextValue) && isNumber(expressionStack.peek()) && !expressionStack.peek().equals("0")) {
                    expressionStack.push(expressionStack.pop() + nextValue);
                } else if (isArithmeticOperation(nextValue) && !(isNumber(expressionStack.peek())  || expressionStack.peek().equals("0")) ) {
                    throw new RuntimeException("There can't be multiple arithmetic operations in row");
                } else {
                    expressionStack.push(nextValue);
                }

            } else {
                // Inserting of first element, it can
                if (isDigit(nextValue)) {
                    expressionStack.push(nextValue);
                } else {
                    if (nextValue.equals("-")) {
                        expressionStack.push("-");
                    } else {
                        throw new RuntimeException("Invalid expression: first character can be only a positive or negative number");
                    }
                }

            }

        }
        return expressionStack;
    }


    public static boolean isDigit(String val) {
        return List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9").contains(val);
    }

    public static boolean isArithmeticOperation(String val) {
        return List.of("+", "-", "*", "/").contains(val);
    }

    public static boolean isNumber(String val) {
        return Pattern.compile("^[1-9][0-9]*[0-9]*$").matcher(val).matches();
    }

    public static Stack<String> invertStack(Stack<String> base) {
        Stack<String> newStack = new Stack<>();
        while (!base.isEmpty()) {
            newStack.push(base.pop());
        }
        return newStack;
    }

}