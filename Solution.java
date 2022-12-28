class Solution {
    //This program creates a running sum of a 1d Array 
    public static int[] runningSum(int[] nums) {
        int INITVAL = 0;
        int prevSumCache = INITVAL;
        for(int i = INITVAL; i < nums.length; i++) {
            if(i > INITVAL){
                if(i > INITVAL + 1) {
                    prevSumCache = nums[i - 1];
                    nums[i] += prevSumCache;
                } else {
                    prevSumCache = nums[i - 1];
                    nums[i] += prevSumCache;

                }
            }
        }
        for(int x : nums){
            System.out.print(x + " ");
        }
        return nums;
    }
    public static void main(String[] args){
        int[] testArray = new int[]{1,2,3,4};
        runningSum(testArray);
    }
    
}