// You're given a method isComposite that checks if the given number is composite or not. 

import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number){
        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final long number = scanner.nextLong();
            System.out.println(isComposite(number));
    }
}