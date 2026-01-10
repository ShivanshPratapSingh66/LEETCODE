class Solution {
    public boolean judgeCircle(String moves) {
        int m=0,n=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch = moves.charAt(i);
           switch(ch){
            case 'U' -> m++;
            case 'D' -> m--;
            case 'L' ->n++;
            case 'R' -> n--;
           }
        }
        if(m==0 && n==0 )return true;
        else 
        return false;
    }
}
