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
    public ListNode mergeNodes(ListNode head) {
        ListNode h=head;
          ListNode x=head;
            ListNode y=head.next;
        while(y!=null){
           int sum=0;
            while(y.val!=0){
                sum+=y.val;
                y=y.next;
            }
            x.val=sum;
            x.next=y.next;
            x=x.next;
            if(x==null){
                y=null;
            }else y=y.next;
        }
        return head;
    }
}