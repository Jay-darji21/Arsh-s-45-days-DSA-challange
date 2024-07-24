// 203. Remove LinkedList elements
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(1)


//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}