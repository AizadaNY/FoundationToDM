package week19;

public class Hanoi {

    public void hanoi(int n, int from, int to) {
        if (n == 0) return;
        int aux = (1 + 2 + 3) - (from + to);
        hanoi(n - 1, from, aux);
        System.out.println(n + " " + from + " " + to);
        hanoi(n - 1, aux, to);
    }
}
