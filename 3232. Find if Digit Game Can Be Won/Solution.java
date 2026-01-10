class Solution {
    public boolean canAliceWin(int[] nums) {
        int bob=0,alice=0;
        for(int a : nums)
        {
          if(a<=9)
          bob+=a;
          else
          alice+=a;
        }
        if(bob==alice)
        return false;
        else
        return true;
    }
}
