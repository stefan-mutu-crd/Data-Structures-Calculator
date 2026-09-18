import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Tests cases

        String expression = "1+0-0+1";
        Stack<String> expressionStack = new Stack<>();

        expressionStack = Utils.convertStringToStack(expression);

//        for (int i = 0; i < expression.length(); i++) {
//
//            String nextValue = String.valueOf(expression.charAt(i));
//
//            if (!(Utils.isArithmeticOperation(nextValue) || Utils.isDigit(nextValue))) {
//                throw new RuntimeException("Invalid character: \"" + nextValue + " \" is not a number or a arithmetic expression");
//            }
//
//            if (!expressionStack.isEmpty()) {
//                if (Utils.isDigit(nextValue) && Utils.isNumber(expressionStack.peek())) {
//                    expressionStack.push(expressionStack.peek() + nextValue);
//                } else {
//                    expressionStack.push(nextValue);
//                }
//            } else {
//                // Inserting of first element, it can
//                if (Utils.isDigit(nextValue)) {
//                    expressionStack.push(nextValue);
//                } else {
//                    if (nextValue.equals("-")) {
//                        expressionStack.push("-");
//                    } else {
//                        throw new RuntimeException("Invalid expression: first character can be only a valid number, all but 0");
//                    }
//                }
//
//            }
//
//        }
        System.out.println("Expression: " + expression);
        System.out.println("Old stack: " + expressionStack);
        System.out.println("New Stack: " + Utils.invertStack(expressionStack));

        //return one value
        int result = 0;

    }
}