import java.util.Arrays;

public class loopArray {
     public static void main(String[] args) {
         int n = 10;
         int[] squares = new int[n];
         for (int i = 0; i < squares.length; i++){
             squares[i] = i * i;
             
         }
         System.out.println(Arrays.toString(squares));
        
    }
}
