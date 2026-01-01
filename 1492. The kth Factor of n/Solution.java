class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
           {  list.add(i);
           }
        }
        list.add(n);
       
        Collections.sort(list);
        if(k<=list.size())
        {
            return list.get(k-1);
        }
        return -1;
        
    }
}
