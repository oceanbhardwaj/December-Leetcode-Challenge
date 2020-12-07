class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=n-1;
        int count=1;
        while(row_start<=row_end && col_start<=col_end)
        {
            for(int i=row_start;i<=row_end;i++)
            {
                arr[row_start][i]=count;
                count++;
            }
            row_start++;
            
            for(int i=row_start;i<=row_end;i++)
            {
                arr[i][col_end]=count;
                count++;
            }
            col_end--;
            
            for(int i=col_end;i>=col_start;i--)
            {
                arr[row_end][i]=count;
                count++;
            }
            row_end--;
            
            for(int i=row_end;i>=row_start;i--)
            {
                arr[i][col_start]=count;
                count++;
            }
            col_start++;
        }
        return arr;
        
    }
}