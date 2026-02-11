class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        int i=num.length-1;
        List<Integer> list= new LinkedList<>();
        while(i>=0 || k>0 || carry>0){
         int  temp=carry;
           if(i>=0)
           {
            temp+=num[i];
            i--;
           }
           temp+=k%10;
           k/=10;
           list.addFirst(temp%10);
        carry=temp/10;
             
        }
        
        return list;
        
    }
}
