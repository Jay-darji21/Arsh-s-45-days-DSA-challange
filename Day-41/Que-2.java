// 230. Kth smallest element in binary tree
// Medium

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ArrayList<Integer> inOrderTraversal(TreeNode root,ArrayList<Integer> result){
        if(root==null) return result;
        inOrderTraversal(root.left,result);
        result.add(root.val);
        inOrderTraversal(root.right,result);

        return result;

    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result = inOrderTraversal(root,new ArrayList<>());
        return result.get(k-1);
    }
}