package Task;

public class Operation extends Calc {

    public static char op() {
        char operation;
        if (s.contains("+")) {
            operation = '+';
        } else if (s.contains("-")) {
            operation = '-';
        } else if (s.contains("*")) {
            operation = '*';
        } else if (s.contains("/")) {
            operation = '/';
        } else {
            operation = 0;
        }
        return operation;
    }

    public static int Result(int num1, int num2, char op) {
        do {
            int result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    return 101;
            }
            return result;
        }while (op == '+' || op == '-' || op == '*' || op == '/');
    }
}
