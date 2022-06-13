package ctci.stacksandqueues;

import java.util.Stack;

public class SortStack {
    void sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();

        while (!s.isEmpty()) {
            // Pop the peek element from the primary stack & call it tmp
            int tmp = s.pop();
            // Pop all elements from the secondary stack that are GT that tmp
            // Push what you pop from the secondary to primary
            while (!r.isEmpty() && r.peek() > tmp) s.push(r.pop());
            // Now this is the place for the tmp element in the secondary to be in order
            r.push(tmp);
        }

        // copy the elements from r back to s
        while (!r.isEmpty()) s.push(r.pop());
    }
}
