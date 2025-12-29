class Solution {
    public boolean checkString(String s) {
     
     if(s.contains("b"))
       { int b =s.indexOf("b");
        if(s.substring(b,s.length()).contains("a"))
        return false;
       else
        return true;
        }
        return true;
    }
}
