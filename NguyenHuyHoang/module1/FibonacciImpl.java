package NguyenHuyHoang.module1;

public class FibonacciImpl implements Fibonacci {

    @Override
    public int fib(int n, boolean flag) {
        if (flag) {
            throw new IllegalArgumentException("flag must be false for loop implementation");
        }
        return fibLoop(n);
    }

    private int fibLoop(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
