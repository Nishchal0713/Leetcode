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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder= new ArrayList<>();
        inorder(root,inorder);
        return build(inorder,0,inorder.size()-1);
    } 
    public void inorder(TreeNode root,List<Integer> inorder){
        if(root==null) return;
            inorder(root.left,inorder);
            inorder.add(root.val);
            inorder(root.right,inorder);
        }
    
        public TreeNode build(List<Integer> arr,int low,int high)
        {
            if(low>high)
            {
                return null;
            }
            int mid=(low+high)/2;
            TreeNode root = new TreeNode(arr.get(mid));
            root.left=build(arr,low,mid-1);
            root.right=build(arr,mid+1,high);
            return root;
        }
    }
