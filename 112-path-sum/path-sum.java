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
    boolean flag=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int num=0;
        flag=false;
        traverse(root,targetSum,num);
        return flag;

    }
    public void traverse(TreeNode root, int targetSum,int num) {
        if(root==null){
            return;
        }
        num+=root.val;
        if (root.left == null && root.right == null) {
            if (num == targetSum) {
                flag = true;
            }
            return;
        }
        traverse(root.left,targetSum,num);
        traverse(root.right,targetSum,num);
    }
}