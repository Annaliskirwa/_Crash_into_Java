/**Write a program that reads three strings and outputs them in the reverse order, each in a new line. */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // basic scanning idea
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

    }
}
