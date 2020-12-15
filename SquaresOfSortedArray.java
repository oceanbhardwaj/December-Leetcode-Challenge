/*class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}*/




class Solution {
    public int[] sortedSquares(int[] nums) {
      int l=0;
        int arr[]=new int[nums.length];
        int r=nums.length-1;
        int d=r;
        while(l<=r)
        {
            if(Math.abs(nums[l])<=Math.abs(nums[r]))
            {
                arr[d--]=nums[r]*nums[r];
                r--;
            }
            else
            {
                arr[d--]=nums[l]*nums[l];
                l++;
            }
                
        }
        
        return arr;
        
        
        
    }
}