package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 07:36 PM
 */
public class PrimeNumber {

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(9));
    }
}
