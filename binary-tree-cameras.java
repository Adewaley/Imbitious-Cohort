/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    // set the parent to the current node
        // if a camera is needed? 
        // when would a camera be needed? 
        // use DFS to traverse till the leaf node(assume leaf node children are covered)
        // increment camera count whenever child node is not covered 
        // if child node has a camera then set the parent monitored status to true
        // camera status, monitored status?
        // if child node does not have a camera then we have to add a camera to parent node(and increment the camera count)
        // whenever we add a camera to a node we mark both the chilren and parent as covered     
    private int unmonitored = 0;
    private int monitoredNoCam = 1;
    private int monitoredWCam = 2;
    private int cameras = 0;
    
    public int minCameraCover(TreeNode root) {
        if (root == null) return 0;
        int top = dfs(root);
        return cameras + (top == unmonitored ? 1 : 0);
    }
    
    private int dfs(TreeNode current) {
        if (current == null) return monitoredNoCam;
        int left = dfs(current.left);
        int right = dfs(current.right);
        if (left == monitoredNoCam && right == monitoredNoCam) {
            return unmonitored;
        } else if (left == unmonitored || right == unmonitored) {
            cameras++;
            return monitoredWCam;
        } else {
            return monitoredNoCam;
        }
    }
    
    
}
