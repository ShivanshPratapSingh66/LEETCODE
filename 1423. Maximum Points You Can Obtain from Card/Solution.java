class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k<=0) return 0;
        int i=0,j=cardPoints.length-1;
        int leftSum=0,rightSum=0,maxSum=0;
        for(i=0;i<k;i++)
        {
            leftSum+=cardPoints[i];
        }
        maxSum=leftSum;
        i-=1;
        while(i>=0)
        {
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[j];
            i--;j--;
            maxSum=Math.max(maxSum,(leftSum+rightSum));
        }
        return maxSum;
    }
}
