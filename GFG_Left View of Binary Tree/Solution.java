/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
        return list;
        solve(root,list,0);
        return list;
    }
    public static void solve(Node root,ArrayList<Integer>ans,int level){
        if(root==null)
        return;
        if(level==ans.size())
        ans.add(root.data);
        solve(root.left,ans,level+1);
        solve(root.right,ans,level+1);
    }
}
