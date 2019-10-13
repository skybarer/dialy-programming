package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 13-10-2019
 * @time : 07:53 AM
 */
public class LongestIncreasingSubsequence {
    // https://www.techiedelight.com/longest-increasing-subsequence-using-dynamic-programming/

    private static int lis(int[] A, int i, int n, int prev) {
        if (i == n) return 0;
        int t1 = 0;
        if (A[i] > prev) {
            t1 = 1 + lis(A, i + 1, n, A[i]);
        }
        int t2 = lis(A, i + 1, n, prev);
        return Math.max(t1, t2);
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Length of lis is : " + lis(arr, 0, n, arr[0]));
    }
}
