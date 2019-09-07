package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 06:29 PM
 */
public class FibonacciRecursion {

    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("FibonacciRecursion: " + fib(7));
    }
}
