package week19;

public class FibonacciNumbers {

    public int fib(int n) {
        int sum = 0;
        if(n <=0){
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }
}
