class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
        for(int a:arr)  { if(a==0) count++; }
        int i=arr.length-1,j=arr.length-1+count;
        while(i!=j)
        {
            write(arr,i,j--);
            if(arr[i]==0)
            write(arr,i,j--);

            i--;
        }
    }
    public static void write(int[] num,int i,int j){
        if(j<num.length)
        num[j]=num[i];
    }
}
