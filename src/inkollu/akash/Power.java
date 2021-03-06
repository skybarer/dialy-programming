package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 04:40 PM
 */
public class Power {

    private static int pow(int m, int n) {
        if (n == 0) return 1;
        return pow(m , n - 1) * m;
    }

    // power with reduced activation records in stack
    private static int powReducedMul(int m, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) return powReducedMul(m * m, n / 2);
        return powReducedMul(m * m, (n - 1) / 2) * m;
    }

    public static void main(String[] args) {
        System.out.println("Power: " + pow(2, 5));
        System.out.println("Power: " + powReducedMul(2, 10));
    }
}
