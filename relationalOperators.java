import util.java.Scanner;

class CheckDescOrder{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = (h1 >= h2) && (h2 >= h3);

        System.out.println(descOrdered);

    }
}

// returns true or false depending on the inputs fed in by the scanner.