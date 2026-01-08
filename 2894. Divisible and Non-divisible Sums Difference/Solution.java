class Solution {
    public int differenceOfSums(int n, int m) {
     
        int sum1=0,sum2=0;
        while(n>0)
        {
            if(n%m==0)sum2+=n;
            else
            sum1+=n;
            n--;

        }
        return (sum1-sum2);
        
    }
}
