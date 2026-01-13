class Solution {
    public int countAsterisks(String s) {
        int cc=0;
        int ccc=0;
        for(char c:s.toCharArray()){
            if(c=='|'){cc++;}
            if(cc%2==0){
                if(c=='*') ccc++;
            }
        }
   return ccc; }
}
