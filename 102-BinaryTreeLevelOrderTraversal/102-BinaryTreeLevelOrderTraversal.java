// Last updated: 7/8/2026, 3:37:39 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
           return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int len = q.size();
            List<Integer> res = new ArrayList<>();
            while(len-- > 0)
        {
            TreeNode temp = q.poll();
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
            res.add(temp.val);
        }
        ans.add(res);
        }
        return ans;
    }
}