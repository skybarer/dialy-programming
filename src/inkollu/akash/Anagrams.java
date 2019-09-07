package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 07:19 PM
 */
public class Anagrams {

    public static boolean areAnagrams(String s1, String s2) {
        char[] chA1 = s1.toCharArray();
        char[] chA2 = s2.toCharArray();
        Arrays.sort(chA1);
        Arrays.sort(chA2);
        return Arrays.equals(chA1, chA1);
    }

    public static void main(String[] args) {
        System.out.println("Anagrams: " + areAnagrams("listen", " silent"));
    }
}
