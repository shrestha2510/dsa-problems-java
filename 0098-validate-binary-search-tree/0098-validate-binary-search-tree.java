class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode max = null;
        TreeNode min = null;
        return valid(root, min, max);        
    }
    public boolean valid(TreeNode root , TreeNode min, TreeNode max){
        if(root==null){
            return true;
        }
        if(min!=null && root.val<= min.val){
            return false;
        }
        else if(max!=null && root.val >= max.val){
            return false;
        }
        return valid(root.left , min, root) && valid(root.right, root , max);
    }
}