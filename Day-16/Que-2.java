// 257. Binary Tree Path
// Easy

// TimeComplexity : O(n)
// SpaceComplexity : O(n)

import java.util.ArrayList;
import java.util.List;

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
     List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        helper(root,currentPath,result);
        return result;
    }

    public static void helper(TreeNode root, List<Integer> currentPath , List<String> result){
        if(root==null) return;

        currentPath.add(root.val);

        if(root.left == null && root.right == null){
            result.add(pathToString(currentPath));
        }
        else{
            helper(root.left,currentPath,result);
            helper(root.right,currentPath,result);
        }

        currentPath.remove(currentPath.size()-1);
    }

    private static String pathToString(List<Integer> path){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<path.size() ; i++){
            sb.append(path.get(i));
            if(i<path.size()-1){
                sb.append("->");
            }
        }

        return sb.toString();
    }
}