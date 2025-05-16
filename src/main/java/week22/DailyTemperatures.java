package week22;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] ngt = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ngt[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ngt;
    }
}
