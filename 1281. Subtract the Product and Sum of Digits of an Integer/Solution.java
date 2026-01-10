class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1;
        while(n>0)
        {
            int last=n%10;
            n/=10;
            mul*=last;
            sum+=last;
        }
        return(mul-sum);
        
    }
}
