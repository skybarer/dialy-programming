package inkollu.akash;

import java.util.*;

/**
 * @author : akashdhar
 * @date : 25-09-2019
 * @time : 07:42 AM
 */

/*
* Given a pixel sequence consisting of red, green and blue pixels find the count of all contiguous subsequences such
 * that each subsequence has a minimum length of 3 and the sequence cycles between red r, green g and blue b.
  * For eg. if the sequence starts with g then the next character in the sequence should be b and the next should
  * be r and so on.
Input Format
First line of test case consists of an integer t denoting the number of test cases. Next t test cases follow.
Each test case consists of two lines. First line of each test case is the length of the pixel sequence.
Second line is the pixel sequence.

5
3
rgb
4
brgb
2
rg
1
b
16
rgbrbbrgbgbrgrgb

Sample Output
1
3
0
0
10
* */

// TODO need to improvise efficiency

public class RGBContinuousSubArrays {

    private static char[] getCorrectSubString(char c) {
        if (c == 'g') return "gbr".toCharArray();
        if (c == 'b') return "brg".toCharArray();
        return "rgb".toCharArray();
    }

    private static boolean isCorrectRotated(String str, int l) {
        char[] required = getCorrectSubString(str.charAt(0));
        int i = 0;

        if (str.contains("rr") || str.contains("gg") || str.contains("bb")) {
            return false;
        }

        while (i < l) {
            if (str.charAt(i) != required[i % 3]) {
                return false;
            }
            i++;
        }
        return true;
    }


    private static boolean isValidRGB(String subStr) {
        int l = subStr.length();
        return l >= 3 && isCorrectRotated(subStr, subStr.length());
    }

    private static int printRGBContinuousSubArraysCount(String s, int l) {
        int countValidSubString = 0;
        for (int i = 0; i <= l - 3; i++) {
            for (int j = i + 3; j <= l; j++) {
                if (isValidRGB(s.substring(i, j))) {
                    countValidSubString++;
                }
            }
        }
        return countValidSubString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            String s = sc.next();
            System.out.println(printRGBContinuousSubArraysCount(s, l));
        }
    }

}
