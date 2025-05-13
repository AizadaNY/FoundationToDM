package week22;

import java.util.Stack;

public class EvaluateRPN {

    public int evalRPN(String[] tokens) {

        int a, b;
        Stack<Integer> s = new Stack<Integer>();

        for (String t : tokens) {
            if (t.equals("+")) {
                s.add(s.pop() + s.pop());
            } else if (t.equals("-")) {
                b = s.pop();
                a = s.pop();
                s.add(a - b);
            } else if (t.equals("*")) {
                s.add(s.pop() * s.pop());
            } else if (t.equals("/")) {
                b = s.pop();
                a = s.pop();
                s.add(a / b);
            } else {
                s.add(Integer.parseInt(t));
            }
        }

        return s.pop();
    }
}
