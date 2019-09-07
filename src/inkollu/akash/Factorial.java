package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 04:34 PM
 */
public class Factorial {

    private static int fact(int n) {
        if (n == 0) return 1;
        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println("Factorial: "+ fact(5));
        System.out.println("Factorial: "+ fact(6));
    }
}
