class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // find the porbable row 
        int row= probableRow(matrix,target);
        if(row==-1) return false;
        int st=0,end=matrix[row].length-1;

        while(st<=end)
        {
            
            int mid=(st+end)/2;
            if(target==matrix[row][mid])
            return true;
            else if(target>matrix[row][mid])
            st=mid+1;
            else
            end=mid-1;
                  
        }
        return false;            
    }
    public static int probableRow(int [][] A,int T)
    {
        int st=0,end=A.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(T>=A[mid][0] && T <=A[mid][A[0].length-1])
                return mid;
            else if(T > A[mid][0])
            st=mid+1;
            else 
            end=mid-1;
        
        }
        return -1;
    }
}
