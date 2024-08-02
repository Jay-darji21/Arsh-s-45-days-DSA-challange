// 98. Validate binary search tree
// Medium


import java.util.ArrayList;

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
    ArrayList<Integer> result = new ArrayList<>();
    public void inOrderTraversal(TreeNode root){
        if(root==null) return;
        if(root.left != null)
        inOrderTraversal(root.left);
        result.add(root.val);
        if(root.right!=null)
        inOrderTraversal(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        inOrderTraversal(root);
        
        int n=result.size();
        for(int i=0 ; i<n-1 ; i++){
            if(result.get(i) >= result.get(i+1)) return false;
        }
        return true;
    }
}