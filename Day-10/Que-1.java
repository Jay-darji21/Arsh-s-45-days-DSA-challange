// 160. Intersection of two LinkedList

// TimeComplexity : O(n)
// SpaceComplexity : O(1)


// Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
            a = a==null?headB : a.next;
            b = b==null?headA : b.next;
        }
        return a;
    }
}

