class Main{
    public static void main(String[]args){
        int[] array ; //declaring an array
        int[] numbers = {1,2,3,4}; //instantiating and initializing an array

        int[] numberss = new int[n]; 
        //where n is the lenth of the array; creating an array using the new keyword

        int length = array.length //returns number of elements in the array
        // accessing values in the array:
        int[] numbers = new int[3]; // numbers: [0, 0, 0]
        numbers[0] = 1; // numbers: [1, 0, 0]
        numbers[1] = 2; // numbers: [1, 2, 0]
        numbers[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]


        // Array utility classes

        // Converting an array to string
        byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
        String arrayAsString = Arrays.toString(famousNumbers); // [0, 1, 2, 4, 8, 16, 32, 64]

        // Sorting arrays
        long[] bigNumbers = { 200000000L, 400000000L, 100000000L, 300000000L }; // it's unsorted

        Arrays.sort(bigNumbers);
    }
}