// 889. Construct binary tree from Preorder and postorder traversal
// Medium

import java.util.HashMap;

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
    int postpreindex=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer,Integer> postOrderIndex = new HashMap<>();
        for(int i=0; i<postorder.length ; i++){
            postOrderIndex.put(postorder[i],i);
        }
        return helper(preorder,postorder,postOrderIndex,0,postorder.length-1);
    }

    public TreeNode helper(int[] preorder,int[] postorder,HashMap<Integer,Integer> map,int start,int end){
        if(start>end) return null;

        TreeNode root = new TreeNode(preorder[postpreindex++]);

        if(start==end){
            return root;
        }

        int index = map.get(preorder[postpreindex]);

        root.left = helper(preorder,postorder,map,start,index);
        root.right = helper(preorder,postorder,map,index+1,end-1);

        return root;
    }
}