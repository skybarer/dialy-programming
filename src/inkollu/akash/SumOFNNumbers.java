package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 04:26 PM
 */
public class SumOFNNumbers {

    private static int sum(int n) {
        if (n == 0) return 0;
        return sum(n - 1) + n;
    }

    private static int iSum(int n) {
        int iterativeSum = 0;

        for (int i = 1; i <= n; i++) {
            iterativeSum += i;
        }
        return iterativeSum;
    }

    public static void main(String[] args) {
        System.out.println("SumOFNNumbers: " + sum(10));
        System.out.println("SumOFNNumbers: " + iSum(10));
    }
}
