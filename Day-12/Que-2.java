// 86. Partion of List
// Medium

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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode();
        ListNode d2 = new ListNode();

        ListNode low = d1,high = d2;

        ListNode curr = head;
        while(curr!=null){
            if(curr.val < x){
                low.next = curr;
                low = curr;
            }
            else{
                high.next = curr;
                high = curr;
            }
            curr = curr.next;
        }

        // Merge two lists
        low.next = d2.next;
        high.next = null;

        return d1.next;

    }
}