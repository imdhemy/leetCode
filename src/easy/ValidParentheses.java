package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (null == s) return false;
        if (s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpening(c))
                stack.push(c);
            else if (stack.isEmpty()) {
                return false;
            } else if (c == '}') {
                if (stack.pop() != '{')
                    return false;
            } else if (c == ']') {
                if (stack.pop() != '[')
                    return false;
            } else {
                if (stack.pop() != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpening(char c) {
        return c == '{' || c == '[' || c == '(';
    }
}
