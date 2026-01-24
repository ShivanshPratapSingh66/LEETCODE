class Solution {
    public static  boolean rowCheck(char [] row){
      HashSet<Character> set = new HashSet<>();
      for(int i=0;i<row.length;i++)
      {
        if(row[i]!='.')
       { if(set.contains(row[i]))
        return false;
        set.add(row[i]);}
      }
      return true;
    }
    //.......................................................
    public static boolean colCheck(char[][] board,int j)
    {
     HashSet<Character> set = new HashSet<>();
         for(int i=0;i<board.length;i++)
        {
        if(board[i][j]!='.')
           { if(set.contains(board[i][j]))
            return false;
            set.add(board[i][j]);}
        }
        return true;
    }
    public static boolean miniSudukoCheck(char[][] mini,int a,int b){
        HashSet<Character> set = new HashSet<>();
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++)
            {
                
              if(mini[i][j]!='.')
              {  if(set.contains(mini[i][j]))
                return false;
                set.add(mini[i][j]);}
            }
           
        }
         return true;
    }
    public boolean isValidSudoku(char[][] board) {
        // chehck for rowwwwwww and colll
        for(int i=0;i<board.length;i++){
            if(!rowCheck(board[i])) return false;
            if(!colCheck(board,i)) return false;
        }
        // mini suduko
        for(int i=0;i<board.length;i=i+3)
        {
            for(int j=0;j<board[i].length;j=j+3)
            {
                if(!miniSudukoCheck(board,i,j))
                return false;
            }
        }
        return true;

        
    }
}
