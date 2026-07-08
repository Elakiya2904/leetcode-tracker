// Last updated: 7/8/2026, 3:37:46 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       inOT(root, res);
       return res; 
    }
    private void inOT(TreeNode root, List<Integer> res)
    {
        if(root == null)
        return;
        inOT(root.left,res);
        res.add(root.val);
        inOT(root.right, res);

    }
}