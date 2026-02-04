/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1 ) return head;
        ListNode st= head;
        ListNode end= head;
        for(int i=0;i<k-1;i++){
            if(end.next==null)
            return head;
            end=end.next;
        }
        ListNode Newhead = end.next;
        ListNode ans= reverseKGroup(Newhead,k);
        reverse(st,end.next);
        st.next=ans;
        return end;

        
    }
    public static void reverse(ListNode st,ListNode end){
        ListNode prev=null;
        ListNode curr=st;
        while(curr!=end){
            ListNode Next = curr.next;
             curr.next=prev;
             prev=curr;
              curr=Next;
           
        }
        
    }
}
