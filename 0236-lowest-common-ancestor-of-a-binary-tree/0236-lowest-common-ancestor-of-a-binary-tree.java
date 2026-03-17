class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getpath(root, p, path1);
        getpath(root, q, path2);
        int i=0;
        for(; i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        TreeNode lca = path1.get(i-1);
        return lca;
        
    }
    public static boolean getpath(TreeNode root, TreeNode n, ArrayList<TreeNode> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root==n){
            return true;
        }
        boolean fl = getpath(root.left, n, path);
        boolean fr = getpath(root.right, n, path);
        if(fl || fr){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}