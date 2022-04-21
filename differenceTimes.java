// Find how many seconds passed between the two moments of time on the same day.

// You are given the integer values representing these moments: hours, minutes and seconds for each of them. It is guaranteed that the earlier moment goes first in the input.



import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int mins = scanner.nextInt();
        int secs = scanner.nextInt();
        int finaltime = ((hours * 60 * 60) + (mins * 60) + secs);

        int hours1 = scanner.nextInt();
        int mins1 = scanner.nextInt();
        int secs1 = scanner.nextInt();
        int finaltime1 = ((hours1 * 60 * 60) + (mins1 * 60) + secs1);

        int difference = (finaltime1 -  finaltime);

        System.out.println(difference);



    }
}