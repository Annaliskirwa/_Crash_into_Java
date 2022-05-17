import java.util.Scanner;

// Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.



public class sumOfDigits{
    
    public static void integer(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = a / 100;
            int c = a / 10 % 10;
            int d = a % 10;
            int f = ( b + c + d);
            
            System.out.println(f);
        }
    }
}