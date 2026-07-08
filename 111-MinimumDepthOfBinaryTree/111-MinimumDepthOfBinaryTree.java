// Last updated: 7/8/2026, 3:37:31 PM
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
    public int minDepth(TreeNode root) {
       Queue<TreeNode> q = new LinkedList<>();
       if(root == null){
        return 0;
       }
       q.add(root);
       q.add(null);
       int depth = 0;
       while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    depth++;
                    q.add(null);
                }
            }else{
                if(curr.left == null && curr.right == null){
                    depth++;
                    return depth;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
       }

       return 0;
    }
}