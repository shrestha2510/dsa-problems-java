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
    public boolean isSymmetric(TreeNode root) {
       if(root == null){
        return true;
       }
       return Symm(root.left, root.right);
    }
    public boolean Symm(TreeNode root, TreeNode temp){
        if(root == null && temp == null){
            return true;
        }
        if(root == null || temp == null){
            return false;
        }
        if(root.val != temp.val){
            return false;
        }
         return Symm(root.left, temp.right)&& Symm(root.right, temp.left);
    }
}