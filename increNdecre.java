// Write a program that reads four numbers and decrements each of them.
// The program must output the results in the same order separated by spaces.


// First approach
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.print(--a + " " + --b + " " + --c + " " + --d);
    }
}

// using while loop

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int inputLimit = 4;
        String result = " ";
        while (count < inputLimit){
            int number = scanner.nextInt();
            result += --number + " ";
            ++count;
        }
        System.out.println(result)
    }
}