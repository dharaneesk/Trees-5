// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// inorder traversal: left - root - right
// traverse till the left most element
// process left - recurse back to root
// process root and recurse into right node tree

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList();
         helper(root,result);
         return result;
    }

    private void helper(TreeNode root,List<Integer> result){
        if(root == null) return;

        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}