package NguyenHuyHoang.module1;

public class FibonacciImpl implements Fibonacci {

    @Override
    public int fib(int n, boolean flag) {
        if (!flag) {
            throw new IllegalArgumentException("flag must be true for recursive implementation");
        }
        return fibRecursive(n);
    }

    private int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}
