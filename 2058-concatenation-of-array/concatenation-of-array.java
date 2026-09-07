class Solution {
    public int[] getConcatenation(int[] nums) {
        int flag=0;
        int ans[] = new int[nums.length *2];

        for(int i=0 ; i<nums.length;i++)
        {
            ans[i]=nums[i];
        }
         int k=0;
        for(int j=nums.length ; j<ans.length ;j++)
        {
             ans[j] = nums[k];
             k++;
        }
            
        return ans;
        
       
    }
}
