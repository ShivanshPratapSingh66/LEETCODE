class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)
          return false;
        String spp = "!@#$%^&*()-+";
        HashSet<Character>set = new HashSet<>();
        for(int i=0;i<spp.length();i++)
        {
            set.add(spp.charAt(i));
        }
        int low=0,up=0,dig=0,sp=0;
        for(int i=0;i<password.length();i++)
        {
         char ch = password.charAt(i);
         int a=(int)ch;
         if(i!=password.length()-1 && ch==password.charAt(i+1))
                      return false;
          if(a>=97 && a<=122)
             low++;
             else if(a>=65 && a<=91)
             up++;
             else if(a>=48 && a<=57)
             dig++;
             else
              {if(set.contains(ch))
             sp++; }           
        }
        set.clear();
        if(low>=1 && up>=1 && dig>=1 && sp>=1)
         return true;
         else
         return false;
        
    }
}
