class Solution {
    public int fib(int n) {
     
        return (fibb(n));
        
    }
    public static int fibb(int n){
        if(n==1 || n==0)
        return n;
        int fn=fibb(n-1)+fibb(n-2);
        return  fn;
    }
}
