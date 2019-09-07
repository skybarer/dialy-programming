package inkollu.akash;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 01:26 PM
 */
public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberReverse = 0;

        while (number > 0) {
            numberReverse = numberReverse * 10 + number % 10;
            number /= 10;
        }

        System.out.println("NumberReverse: " + numberReverse);
    }
}
