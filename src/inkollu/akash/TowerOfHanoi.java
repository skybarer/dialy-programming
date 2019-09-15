package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 07:02 AM
 */
public class TowerOfHanoi {

    private static void TOH(int n, int A, int B, int C) {
        if (n > 0) {
            TOH(n - 1, A, C, B);
            System.out.printf("from %d to %d \n", A, C);
            TOH(n - 1, B, A, C);
        }
    }

    public static void main(String[] args) {
        TOH(3, 1, 2, 3);
    }
}
