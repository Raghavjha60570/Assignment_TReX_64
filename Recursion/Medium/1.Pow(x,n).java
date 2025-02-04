
class Solution {
    public double myPow(double x, int n) {
        if (n > 0) {
            return powerOfPos(x, n);
        } else if (n < 0) {
            return powerOfNeg(x, n);
        } else {
            return 1.0;
        }
    }

    public static double powerOfPos(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powerOfPos(x, n - 1);
    }

    public static double powerOfNeg(double x, int n) {
        return 1 / powerOfPos(x, -n);
    }
}

