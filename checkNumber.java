// Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.

// Do not forget that zero is not a positive number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        if (num <= 0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}