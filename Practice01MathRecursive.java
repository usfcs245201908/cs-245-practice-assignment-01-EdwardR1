public class Practice01MathRecursive implements Practice01Math {
    /**
     * @param n input value of n
     * @throws Exception throws new exception if n is less than 0
     * @return return value of the factorial of n using recursion
     */
    public int fact(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n is less than 0!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    /**
     * @param n input value of n 
     * @throws Exception throws new exception if n is less than 0
     * @return returns fibonacci value at n using recursion
     */
    public int fib(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n is less than 0!");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}