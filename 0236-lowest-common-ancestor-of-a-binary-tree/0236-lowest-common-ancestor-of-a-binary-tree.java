class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getpath(root, p, path1);
        getpath(root, q, path2);

        int i = 0;

        for(; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        return path1.get(i - 1);
    }

    public boolean getpath(TreeNode root, TreeNode target, ArrayList<TreeNode> path){
        if(root == null) return false;

        path.add(root);

        if(root == target) return true;

        if(getpath(root.left, target, path) || 
           getpath(root.right, target, path)){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}