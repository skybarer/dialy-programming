package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 02:01 PM
 */
public class StringPermutations {

    private static String swap(String input, int i, int j) {
        char[] inputChar = input.toCharArray();
        char temp = inputChar[i];
        inputChar[i] = inputChar[j];
        inputChar[j] = temp;
        return String.valueOf(inputChar);
    }

    private static void permute(String input, int l, int r) {
        if (l == r) {
            System.out.println(input);
        } else {
            for (int i = l; i <= r; i++) {
                input = swap(input, l, i);
                permute(input, l + 1, r);
                input = swap(input, l, i);
            }
        }
    }

    public static void main(String[] args) {
        permute("ABC", 0, 2);
    }
}
