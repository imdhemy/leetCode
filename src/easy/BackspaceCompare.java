package easy;

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c != '#') stack1.push(c);
            else if (!stack1.isEmpty()) stack1.pop();
        }

        for (Character c : t.toCharArray()) {
            if (c != '#') stack2.push(c);
            else if (!stack2.isEmpty()) stack2.pop();
        }

        return stack1.equals(stack2);
    }
}
