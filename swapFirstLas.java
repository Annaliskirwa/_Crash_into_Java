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
}