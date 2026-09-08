class Solution {
    public int[] runningSum(int[] nums) {
       int sums[] = new int[nums.length];
        
        int prev =0 ;

        for(int i=0 ;i< nums.length;i++)
        { 
                sums[i] = prev + nums[i];
                prev=sums[i];
 
        }
        return sums;
    }
}