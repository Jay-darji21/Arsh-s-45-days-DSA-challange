// 234. Palindrome LinkedList

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

// Definition for singly-linked list.

import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int left = 0;
        int right = list.size()-1;
        while(left<right && list.get(left)==list.get(right)){
            left++;
            right--;
        }

        return left>=right;
    }
}