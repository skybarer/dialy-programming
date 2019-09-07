package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 01:42 PM
 */
public class GCD {

    // Euclid's algorithm
    // gcd(a, b) = gcd(b, a % b)
    // https://en.wikipedia.org/wiki/Greatest_common_divisor

    private static int returnGcd(int a, int b) {
        if (b == 0) return a;
        return returnGcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(returnGcd(12, 5));
    }
}
