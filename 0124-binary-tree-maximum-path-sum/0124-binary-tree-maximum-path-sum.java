
class Solution {
     int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
      
       solve(root);
       return maxsum;
    }
    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));

        int currentpath = left + right + root.val;
        maxsum = Math.max(maxsum, currentpath);

        return Math.max(left,right) + root.val;
    }
}