package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 04:56 PM
 */
public class TaylorSeries {

    private static double e(int x, int n) {
        double p = 1;
        double f = 1;
        double r;
        if (n == 0) return 1;

        r = e(x, n - 1);
        p = p * x;
        f = f * n;
        return r + p / f;
    }

    public static void main(String[] args) {
        System.out.println("TaylorSeries: "+ e(1,1));
    }
}
