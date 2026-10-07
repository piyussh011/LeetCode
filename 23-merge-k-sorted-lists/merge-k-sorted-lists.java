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
    public ListNode mergeKLists(ListNode[] lists) {
          if (lists == null || lists.length == 0) return null;  
        Stack<ListNode> st=new Stack<>();
        for(ListNode ls: lists){
            st.push(ls);
        }
       while(st.size()>1){
        ListNode a=st.pop();
        ListNode b=st.pop();
        ListNode c=merge(a,b);
        st.push(c);

       } 
       
       return st.pop();
        
    }
    private ListNode merge(ListNode a,ListNode b){
        ListNode d=new ListNode(-1);
        ListNode h1=a;
        ListNode h2=b;
        ListNode x=d;
        while(h1!=null && h2!=null){
            if(h1.val>h2.val){
                x.next=h2;
                h2=h2.next;
            }
            else{
                x.next=h1;
                h1=h1.next;
            }
            x=x.next;

        }
        if(h1==null) x.next=h2;
        else x.next=h1;
        return d.next;
    }
}