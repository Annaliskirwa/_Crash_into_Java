// Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

import util.java.Scanner;

class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int e = ( b + c + d);
        
        System.out.println(e);
    }
}