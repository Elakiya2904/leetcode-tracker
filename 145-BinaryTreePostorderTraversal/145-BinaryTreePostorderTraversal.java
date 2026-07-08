// Last updated: 7/8/2026, 3:37:10 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       postOT(root, res);
       return res; 
    }
    private void postOT(TreeNode root, List<Integer> res)
    {
        if(root == null)
        return;
        postOT(root.left,res);
        postOT(root.right, res);
        res.add(root.val);

    }
}