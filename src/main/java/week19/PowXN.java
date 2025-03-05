package week19;

public class PowXN {
    public double myPow(double x, int n) {
        long exponent = (long) n;

        if (exponent < 0) {
            exponent = -exponent;
            x = 1 / x;
        }
        return myPov_(x, exponent);
    }

    private double myPov_(double x, long exponent) {
        if (exponent == 0) return 1;

        return (exponent % 2 == 0) ? myPov_(x * x, exponent / 2) :
                myPov_(x * x, exponent / 2) * x;
    }

}
