package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char b : s.toCharArray()) {
            if (isOpening(b)) {
                stack.push(b);
                continue;
            }

            if (stack.isEmpty()) return false;

            if (!isMatching(stack.pop(), b)) return false;
        }

        return stack.isEmpty();
    }

    private boolean isOpening(char b) {
        return b == '(' || b == '[' || b == '{';
    }

    private boolean isMatching(char o, char c) {
        return
                o == '(' && c == ')' ||
                        o == '[' && c == ']' ||
                        o == '{' && c == '}';
    }
}
