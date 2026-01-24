class Solution {
    public void rotate(int[][] matrix) {
        int [][] ans = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                ans[j][i]=matrix[i][j];
            }
        }
        for(int i=matrix.length-1;i>=0;i--)
        {
            int a=0;
            for(int j=matrix[i].length-1;j>=0;j--)
            {
                matrix[i][a++]=ans[i][j];
            }
        }

        
    }
}
