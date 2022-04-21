import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in)

        int N = scanner.nextInt();
        int tens_digit = (N%100)/10;

        System.out.println(tens_digit);

    }
}