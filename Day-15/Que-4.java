// 938. Range Sum of BST
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

//  Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return sum;
        sum += (root.val >= low && root.val<= high) ? root.val : 0;

        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);

        return sum;
    }
}