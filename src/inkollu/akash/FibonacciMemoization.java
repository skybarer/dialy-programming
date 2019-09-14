package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 14-09-2019
 * @time : 07:57 PM
 */
public class FibonacciMemoization {

    private static int memArray[] = new int[26];

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        } else if (memArray[n] != 0) {
            return memArray[n];
        } else {
            memArray[n] = fib(n - 2) + fib(n - 1);
        }
        return memArray[n];
    }

    public static void main(String[] args) {
        System.out.println("FibonacciRecursion: " + fib(7));
    }
}
