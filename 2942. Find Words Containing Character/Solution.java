class Solution {
    public List<Integer> findWordsContaining(String[] w, char x) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<w.length;i++) 
        {
            if(w[i].indexOf(x)!=-1)
            list.add(i);
        }
        return list;
    }
}
