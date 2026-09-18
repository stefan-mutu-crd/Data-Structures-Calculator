import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Tests cases
        String expression = "100+200-300+400";

        Stack<String> expressionStack = Utils.convertStringToStack(expression);

        System.out.println("Expression: " + expression);
        System.out.println("Old stack: " + expressionStack);
        System.out.println("New Stack: " + Utils.invertStack(expressionStack));

    }
}