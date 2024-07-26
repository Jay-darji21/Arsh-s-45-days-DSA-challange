// TimeComplexity : O(n)
// SpaceComplexity : O(n)


 // Definition for singly-linked list.

import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        int n= list.size();
        curr = head;

        for(int i=0 ; i<n/2 ; i++){
            curr.next = new ListNode(list.get(n-i-1));
            curr = curr.next;
            if(n%2 == 0 && i+1 == n/2){
                continue;
            }
            curr.next = new ListNode(list.get(i+1));
            curr = curr.next;
        }
    }
}