import java.util.Arrays;
import java.util.Scanner;

public class readingArray {
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            int len = scanner.nextInt();

            int arr[] = new int[len];
            
            for (int i = 0; i < len; i++){
                arr[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            foreaches(args);
        }

    }

    public static void foreaches(String[]args){
        char [] characters = {'a', 'b', 'c', 'a'};
        int counter = 0;
        for (char ch:characters){
            if (ch == 'a'){
                counter++;
            }
        }
        System.out.print(counter);
    }
}
