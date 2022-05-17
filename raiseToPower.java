// You're given the method power that takes two int numbers n and m. The method should return the value of nm as a long value.

import java.util.Scanner;

public class raiseToPower {

    public static long power(int n, int m) {
        // write your code here
        return (long) Math.pow(n,m);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            System.out.println(power(n, m));
        }
    }
}