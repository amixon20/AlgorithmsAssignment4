import java.util.Stack;
public class InfixPostfix {
    static int precedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; // Default to left-associative
    }

    static String infixToPostfix(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }

            else if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // Pop '('
            }

            else {
                while (!stack.isEmpty() && (precedence(s.charAt(i)) < precedence(stack.peek()) ||
                        precedence(s.charAt(i)) == precedence(stack.peek()) &&
                                associativity(s.charAt(i)) == 'L')) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println(infixToPostfix(s));
    }
}
