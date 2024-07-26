// 19. Remove Nth node from the end of the List
// Medium

//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

//  TimeComplexity : O(n)
//  SpaceComplexity : O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        // Move the fast node through the n
        for(int i=0 ; i<n ; i++) fast = fast.next;

        // If the first node is to remove
        if(fast==null) return head.next;

        // Find the Nth node from the last
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        // Remove Nth node
        slow.next = slow.next.next;

        return head;

    }
}