// 2. Add two numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode newNode = new ListNode(digit);
            temp.next = newNode;
            temp = temp.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }

        ListNode result = dummy.next;
        dummy.next = null;

        return result;

    
    }
}