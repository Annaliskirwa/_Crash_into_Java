public class brokenArray {
    public static void main(String[]args){
        int[] n = { 1, 2, 3, 4, 5, 10, 6 };
        boolean broken = false;

        for (int i = 1; i< n.length; i++){
            if (n[i] < n[i-1]){
                broken = true;
                break;
            }
        }
        if (broken){
            System.out.println("Broken");
        }
        else{
            System.out.println("Not broken");
        }

    }
}
