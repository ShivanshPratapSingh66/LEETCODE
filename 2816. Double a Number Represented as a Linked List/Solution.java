/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public ListNode doubleIt(ListNode head) {
        // Step 1: If the head is >= 5, doubling it will create a carry.
        // We need to introduce a new head node with a value of 0.
        if (head.val >= 5) {
            head = new ListNode(0, head);
        }
        
        ListNode temp = head;
      
        while (temp != null) {
          
            temp.val = (temp.val * 2) % 10;
             if (temp.next != null && temp.next.val >= 5) {
                temp.val += 1;
            }
            
          
            temp = temp.next;
        }
        
        return head;
    }
}
