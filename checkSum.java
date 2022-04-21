// Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.

// The program must output true or false.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int comparison = 20;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (a + b);
        int e = (a + c);
        int f = (b + c);
        System.out.println((d == comparison)| (e==comparison)|(f==comparison));
    }
}
