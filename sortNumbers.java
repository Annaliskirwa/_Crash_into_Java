// Implement a method for sorting a given array of integers in the ascending order.

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void sort(int[] numbers){
        //First approach using sort method
       // Arrays.sort(numbers);

       //Second appraoch using conditional statements
       for(int i = 0; i < numbers.length; i++){
           for (int j = 0; j < numbers.length; j++){
               if (numbers[j] >= numbers[i]){
                   int temp = numbers[i];
                   numbers[i] =  numbers[j];
                   numbers[j] = temp;
               }
           }
       }
    }

    public static void main (String[]args){
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}