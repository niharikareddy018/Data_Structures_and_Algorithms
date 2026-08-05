package Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    static void dfs(TreeNode root, String path, List<String> ls) {
        if (root == null)
            return;

        if (path.length() == 0) {
            path = String.valueOf(root.val);
        } else {
            path = path + "->" + root.val;
        }
        if (root.left == null && root.right == null) {
            ls.add(path);
            return;
        }
        dfs(root.left, path, ls);
        dfs(root.right, path, ls);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new ArrayList<>();
        dfs(root, "", ls);
        return ls;
    }
}
