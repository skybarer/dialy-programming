package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 14-09-2019
 * @time : 08:18 PM
 */
public class CombinationFormula {

    // recursion is formed using pascal's triangle
    private static int nCr(int n, int r) {
        if (r > n) throw new IllegalArgumentException("Not a valid r value : " + r);
        if (r == 0 || r == n) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {
        System.out.println("CombinationFormula: " + nCr(4, 5));
    }
}
