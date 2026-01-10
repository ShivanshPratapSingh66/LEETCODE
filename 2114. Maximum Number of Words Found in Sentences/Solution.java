class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=-1;
        for(int i=0;i<sentences.length;i++)
        {
            int j=0,count=0;
            while(j<sentences[i].length())
            {
            if(sentences[i].charAt(j)==' ' || j==sentences[i].length()-1)
             count++;
             j++;
            }
            max=Math.max(count,max);
        }
        return max;
        
    }
}
