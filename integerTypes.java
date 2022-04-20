import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int million = 1_000_000; //integer
        long one = 1L; //long

        // reading numbers from a standard input
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        // int sum = a + b;
        long sum = a + b;
        System.out.println(sum)
    }
}