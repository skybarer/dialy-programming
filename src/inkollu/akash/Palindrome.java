package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 07:13 PM
 */
public class Palindrome {

    private static boolean isPalindrome(String input) {
        return input.equals(new StringBuffer(input).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println("Palindrome: "+ isPalindrome("sas"));
    }
}
