// 173. Binary Search Iterator
// Medium

import java.util.Stack;

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
 
class BSTIterator {
    private Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        leftTraversal(root);
    }
    public void leftTraversal(TreeNode root){
        while(root!=null){
            st.push(root);
            root = root.left;
        }
    }
    public int next() {
        TreeNode node = st.pop();
        if(node.right != null){
            leftTraversal(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        if(st.isEmpty()) return false;

        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */