class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]>list = new ArrayList<>();
        
        for(int[] interval : intervals){
            int size=list.size();
            if(size==0 || list.get(size-1)[1]<interval[0]){
                list.add(interval);
                
            }else{
                list.get(size-1)[1]=Math.max(list.get(size-1)[1],interval[1]);
            }
        }
       
        int[][] arr=new int[list.size()][2];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}
