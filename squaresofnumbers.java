import java.util.Arrays;

public class squaresofnumbers {
    public static void main(String[] args) {
    int[] squareNumbers = new int[10];

    for (int i = 0; i < 10; i++ ){
        squareNumbers[i] = i * i;
    }
    System.out.println(Arrays.toString(squareNumbers));
}
}
