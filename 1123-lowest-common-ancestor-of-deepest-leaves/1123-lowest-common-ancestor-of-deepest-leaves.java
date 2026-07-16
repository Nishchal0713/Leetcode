class Solution {
    class Depth {
        int depth;
        TreeNode lca;
        Depth(int depth, TreeNode lca) {
            this.depth = depth;
            this.lca = lca;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).lca;
    }

    public Depth dfs(TreeNode node) {
        if (node == null) return new Depth(0, null);

        Depth left = dfs(node.left);
        Depth right = dfs(node.right);

        if (left.depth == right.depth) {
            return new Depth(left.depth + 1, node);
        } else if (left.depth > right.depth) {
            return new Depth(left.depth + 1, left.lca);
        } else {
            return new Depth(right.depth + 1, right.lca);
        }
    }
}