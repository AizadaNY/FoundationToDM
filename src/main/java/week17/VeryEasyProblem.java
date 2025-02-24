package week17;

public class VeryEasyProblem {

    public int result(int n, int x, int y) {
        int left = 0;
        int right = (int) 1e9;
        int answer = -1;

        while (left <= right) {
            int middle = (left + (right - left)) / 2;
            if (middle / x + middle / y >= n) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return answer + Math.min(x, y);

    }
}
