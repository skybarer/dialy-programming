package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 13-10-2019
 * @time : 07:54 AM
 */
public class LongestCommonSubsequence {
    private static int lcs(char[] s1, char[] s2, int i, int j) {
        if (i == 0 || j == 0)
            return 0;
        if (s1[i - 1] == s2[j - 1])
            return 1 + lcs(s1, s2, i - 1, j - 1);
        else
            return Math.max(lcs(s1, s2, i, j - 1), lcs(s1, s2, i - 1, j));
    }

    public static void main(String[] args) {
        char[] s1 = "abcdefghi".toCharArray();
        char[] s2 = "cdgi".toCharArray();
        int i = s1.length;
        int j = s2.length;
        System.out.println("LongestCommonSubsequence:" + lcs(s1, s2, i, j));
    }
}
