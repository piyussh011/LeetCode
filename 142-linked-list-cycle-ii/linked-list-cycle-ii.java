/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p=head;
        ListNode q=head;
        ListNode idx=new ListNode(-1);
        while(q!=null && q.next!=null){
              p=p.next;
            q=q.next.next;
            if(p==q) {
                  p = head;

                while (p != q) {
                    p = p.next;
                    q = q.next;
                }
                return p;
            }
            // p=p.next;
            // q=p.next;
        }
        return null;
    }
}