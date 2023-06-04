class climbStairs2{
    public int climbStairs(int n) {
        int[] F = new int[n + 1];
        return fib(n, F);
    }

    private int fib(int n, int[] F) {
        if (n <= 1) {
            F[n] = 1;
            return 1;
        }

        if (F[n] != 0)
            return F[n];

        F[n] = fib(n - 1, F) + fib(n - 2, F);
        return F[n];
    }
}