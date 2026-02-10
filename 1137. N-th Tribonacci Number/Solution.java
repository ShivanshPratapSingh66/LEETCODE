class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1) return n;
        if(n==2)return 1;
        int ft=0,st=1,tht=1;
        int frt=0;
        for(int i=3;i<=n;i++){
             frt=ft+st+tht;
            ft=st;
            st=tht;
            tht=frt;
        } 
        return frt ;
        
    }
}
