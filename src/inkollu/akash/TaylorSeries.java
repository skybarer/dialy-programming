package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 04:56 PM
 */
public class TaylorSeries {

    private static double p = 1;
    private static double f = 1;

    // https://en.wikipedia.org/wiki/Taylor_series
    private static double exp(int x, int n) {
        double r;
        if (n == 0) return 1;
        r = exp(x, n - 1);
        p = p * x;
        f = f * n;
        return r + p / f;
    }


    public static void main(String[] args) {
        System.out.println("TaylorSeries: " + exp(1, 10));
    }
}
