import java.util.Scanner;

public class sumOfArrays {
    public static void main(String[] args) {
        try (
        Scanner scanner = new Scanner(System.in)) {
            int len = scanner.nextInt();
            int[] arr = new int[len];
            int sum = 0;

            for (int i = 0; i < len; i++){
                arr[i] = scanner.nextInt();
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        
    }
    
}
