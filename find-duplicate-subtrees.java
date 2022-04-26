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
    Map<String, TreeNode> map = new HashMap<>();
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        if (root == null) return result;
        
        traverse(first(root));
        
        for (TreeNode node : map.values()) {
            if (node != null) {
                result.add(node);
            }
        }
        
        return result;
    }
    
    private TreeNode first(TreeNode root) {
        if (root == null) return null;
        if (root.left != null && root.right != null) return root;
        if (root.left != null) return first(root.left);
        return first(root.right);
    }
    
    private void traverse(TreeNode root) {
        if (root == null) return;
        
        String s = preorder(root);
        if (map.containsKey(s)) {
            map.put(s, root);
        }
        else {
            map.put(s, null);
        }
        
        traverse(root.left);
        traverse(root.right);
    }
    
    private String preorder(TreeNode root) {
        if (root == null) return "#";
        return root.val + "," + preorder(root.left) + "," + preorder(root.right);
    }// time: O(n^2)
    // space: O(n)
}
