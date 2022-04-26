// method swaps the first and the last elements of its parameter (array).
class Main{
    public static void swapFirstAndLastElements(int[]nums){
        if (nums.length < 1){
            return;
        }
        int temp = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = temp;
    }
    // calling the method
    public static void main(String[]args){
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        swapFirstAndLastElements(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}