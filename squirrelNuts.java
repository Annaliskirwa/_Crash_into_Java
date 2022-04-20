// N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        int remainder =( K % N);
        System.out.println(remainder);
    }
}
