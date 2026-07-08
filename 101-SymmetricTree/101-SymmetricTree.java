// Last updated: 7/8/2026, 3:37:41 PM
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        return true;
        return isSubSymmetric(root.left,root.right);  
    }
    private boolean isSubSymmetric(TreeNode p, TreeNode q){
        if(p == null || q == null)
            return p==q;
        return (p.val == q.val) && isSubSymmetric(p.left,q.right) && isSubSymmetric(p.right,q.left);
    }
}
