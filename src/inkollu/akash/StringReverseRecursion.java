package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 01:52 PM
 */
public class StringReverseRecursion {

    private static String reverse(String input) {
        if (input.isEmpty()) return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("StringReverseRecursion: "+ reverse("cat"));
    }
}
