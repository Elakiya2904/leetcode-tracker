// Last updated: 7/8/2026, 3:37:11 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       preOT(root, res);
       return res; 
    }
    private void preOT(TreeNode root, List<Integer> res)
    {
        if(root == null)
        return;
        res.add(root.val);
        preOT(root.left,res);
        preOT(root.right, res);

    }
}