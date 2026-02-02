class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
       return kill(list,k,0);
        
    }
    public static int kill(ArrayList<Integer>li,int k,int kill){
        if(li.size()==1) return li.get(0);
        kill= (kill+k-1)%li.size();
        li.remove(kill);
        return kill(li,k,kill);
    }
}
