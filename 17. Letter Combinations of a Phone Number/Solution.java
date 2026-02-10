class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<digits.length();i++){
            char ch = digits.charAt(i);
            switch(ch){
                case '2' -> map.put(ch,"abc");
                case '3' -> map.put(ch,"def");
                case '4' -> map.put(ch,"ghi");
                case '5' -> map.put(ch,"jkl");
                case '6' -> map.put(ch,"mno");
                case '7' -> map.put(ch,"pqrs");
                case '8' -> map.put(ch,"tuv");
                case '9' -> map.put(ch,"wxyz");
                 
            }
        }
        List<String> list = new ArrayList<>();
        combinations(list,new StringBuilder(),digits,0,map);
        return list;


    }
    public static void combinations(List<String>list ,StringBuilder curr,String digits,int idx,Map<Character,String>mp){
        if(idx==digits.length()){
            list.add(curr.toString());
            return;
        }
        String letter = mp.get(digits.charAt(idx));
        for(char ch : letter.toCharArray()){
            curr.append(ch);
        combinations(list,curr,digits,idx+1,mp);
        curr.deleteCharAt(curr.length() - 1);
        }
    }
}
