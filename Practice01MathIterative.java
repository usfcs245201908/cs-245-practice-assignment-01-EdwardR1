public class Practice01MathIterative implements Practice01Math {
    /**
     * @param n Input value
     * @throws Exception if n is less than 0, throws a new exception
     * @return total value of the factorial of n using iteration
     */
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

    /**
     * @param n input value of n
     * @throws Exception if n is less than 0, throws a new exception
     * @return fibonacci value at n
     */
    public int fib(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n is less than 0!");
        } else {
            int f = 0;
            int tempLast1 = 0;
            int tempLast2 = 1;
            for (int i = 1; i <= n; i++) {
                f = tempLast1 + tempLast2;
                if (i % 2 == 0) {
                    tempLast1 += tempLast2;
                } else {
                    tempLast2 += tempLast1;
                }
            }
            return f;
        }
    }
}