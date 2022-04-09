package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        if (n == 0) return result;

        generateParenthesis(result, new StringBuilder(), n, 0, 0);

        return result;
    }

    private void generateParenthesis(List<String> result, StringBuilder sb, int n, int open, int close) {
        if (open == n && close == open) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append("(");
            generateParenthesis(result, sb, n, open + 1, close);
            sb.setLength(sb.length() - 1);
        }

        if (close < open) {
            sb.append(")");
            generateParenthesis(result, sb, n, open, close + 1);
            sb.setLength(sb.length() - 1);
        }
    }
}
