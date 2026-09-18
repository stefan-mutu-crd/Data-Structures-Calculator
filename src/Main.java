import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String expression = "0+0+0-0";
        Stack<String> expressionStack = Utils.convertStringToStack(expression);
        Stack<String> invertedExpressionStack = Utils.invertStack(Utils.convertStringToStack(expression));
        int result = Utils.stackCalculation(invertedExpressionStack);

        System.out.println("Expression: " + expression);
        System.out.println("Old stack: " + expressionStack);
        System.out.println("New Stack: " + invertedExpressionStack);
        System.out.println("Result: " + result);

    }
}