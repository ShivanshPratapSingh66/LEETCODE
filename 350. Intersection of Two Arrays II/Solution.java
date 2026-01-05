	
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a: nums1)
        {
            mp.put(a,mp.getOrDefault(a,0)+1);

        }
        for(int a :nums2)
        {
            if(mp.containsKey(a))
            { 
                list.add(a);
                mp.put(a,mp.get(a)-1);
                if(mp.get(a)==0)
                mp.remove(a);
                           }

        }
        int arr[]= new int[list.size()];
        int i=0;
        for(int a : list)
        {
            arr[i++]=a;
        }
        return arr;
        
    }
}
