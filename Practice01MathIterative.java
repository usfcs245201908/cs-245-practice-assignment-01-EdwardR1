public class Practice01MathIterative implements Practice01Math {
    public int fact(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n is less than 0!");
        } else {
            int total = 1;
            for (int i = 1; i <= n; i++) {
                total *= i;
            }
            return total;
        }
    }

    public int fib(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n is less than 0!");
        } else {
            int f = 0;
            int tl1 = 0;
            int tl2 = 1;
            for (int i = 1; i <= n; i++) {
                f = tl1 + tl2;
                if (i % 2 == 0) {
                    tl1 += tl2;
                } else {
                    tl2 += tl1;
                }
            }
            return f;
        }
    }
}