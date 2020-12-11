class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int count=0;
        
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i]==nums[i-1] && count==0)
           { 
               nums[j++]=nums[i];
               count=1;
           }
           else if(nums[i]!=nums[i-1])
           {nums[j++]=nums[i];
            count=0;
           }
       }  
       return j;
        
    }
}