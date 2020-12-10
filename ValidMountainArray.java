class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n=arr.length;
        if(n<3)
            return false;
        if(arr[0]>arr[1])
            return false;
        int flag1=0;
        int flag2=0;
        int d=arr[0];
       int i=1;
            while(i<n  && arr[i]>d)
            {
                flag1=1;
                d=arr[i];
                i++;
            }
            while(i<n && arr[i]<d)
            {
                flag2=1;
                d=arr[i];
                i++;
            }
            if(i==n && flag1==1 && flag2==1)
                return true;
            
                return false;
        
       
    }
}