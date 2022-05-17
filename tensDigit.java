import java.util.Scanner;

public class tensDigit{
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int tens_digit = (N%100)/10;

            System.out.println(tens_digit);
        }

    }
}