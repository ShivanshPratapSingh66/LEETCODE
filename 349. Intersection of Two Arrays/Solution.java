class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a: nums1)
        {
           set.add(a); 
        }
        for(int b: nums2)
        {
            if(set.contains(b))
            {
                list.add(b);
                set.remove(b);
            }
        }
        int [] arr = new int[list.size()];
        int i=0;
        for(int a: list)
        {
            arr[i++]=a;
        }
        return arr;
    }
}
