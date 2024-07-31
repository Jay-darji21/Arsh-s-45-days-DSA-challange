// TimeComplexity : O(n)
// SpaceComplexity : O(n)

//  Definition for a binary tree node.
  class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

 class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
    

        // Travres the right subtree
        if(p.val > parentVal && q.val > parentVal){
            return lowestCommonAncestor(root.right,p,q);
        }
        // Traverse the left subtree
        else if(p.val < parentVal && q.val < parentVal){
            return lowestCommonAncestor(root.left,p,q);
        }
        else{
            return root;
        }
    }
}