package leetcode.le104;

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
    int ans = 0;
    public int maxDepth(TreeNode root) {
        traverse(root, 0);
        return ans;
    }
    public void traverse(TreeNode root, int deep) {
        if (root == null)
            return;
        traverse(root.left, deep + 1);
        traverse(root.right, deep + 1);
        ans = Math.max(ans, deep);
    }
}

public class Test104 {
    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node9 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node9, node20);
        int result = new Solution().maxDepth(root);
        System.out.println(result);
    }
}
