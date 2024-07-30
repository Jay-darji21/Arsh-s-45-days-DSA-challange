// 617. Merge two binary trees
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) {
            if(root2==null) return null;

            return root2;
        }
        else if(root2==null) return root1;

        root2.left = mergeTrees(root1.left,root2.left);
        root2.right = mergeTrees(root1.right,root2.right);
        root2.val += root1.val;

        return root2;
    }
}