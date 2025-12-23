class Solution {
    public double myPow(double x, int n) {
      if(n<0)
      {
        n*=-1;
        return (1/pow(x,n));

      } 
      return pow(x,n); 
       
      
    }
    public double pow(double x, int n)
    {
        
       if(n==0) return 1;
       if(n==1) return x;
       double ans = pow(x,n/2);
       return(n%2==0)?ans*ans:ans*ans*x;
    }
}
