import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); //reads input until a whitespace
        String name1 = scanner.nextLine(); //reads input until the end of the line

        System.out.println("Hello" + name + "again");
    }
}