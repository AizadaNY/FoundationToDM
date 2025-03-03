package week19;

public class FibonacciNumbers {

    public int fib(int n) {

        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }
}
