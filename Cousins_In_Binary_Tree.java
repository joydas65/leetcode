/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
            return false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean f1=false,f2=false;
        while(!q.isEmpty()){
            int n = q.size();
            if((f1 == true && f2 == false) || (f1 == false && f2 == true))
                return false;
            while(n-- > 0){
                TreeNode node = q.poll();
                if(node.val == x)
                    f1 = true;
                if(node.val == y)
                    f2 = true;
                if(f1 == true && f2 == true)
                    return true;
                if(node.val == x && node.left != null && node.left.val == y)
                    return false;
                if(node.val == x && node.right != null && node.right.val == y)
                    return false;
                if(node.val == y && node.right != null && node.right.val == x)
                    return false;
                if(node.val == y && node.left != null && node.left.val == x)
                    return false;
                if(node.left != null && node.right != null){
                    if((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x))
                        return false;
                    else if(node.left.val == x || node.left.val == y){
                        if(f1 == true){
                            f2 = true;
                        }
                        f1 = true;
                    }
                    else if(node.right.val == x || node.right.val == y){
                        if(f2 == true)
                            f1 = true;
                        f2 = true;
                    }
                    q.add(node.left);
                    q.add(node.right);
                }else if(node.left != null){
                    if(node.left.val == x || node.left.val == y){
                        if(f1 == true)
                            f2 = true;
                        else if(f2 == true)
                            f1 = true;
                        else
                            f1 = true;
                    }
                    q.add(node.left);
                }else if(node.right != null){
                    if(node.right.val == x || node.right.val == y){
                        if(f2 == true)
                            f1 = true;
                        else if(f1 == true)
                            f2 = true;
                        else
                            f2 = true;
                    }
                    q.add(node.right);
                }
            }
        }
        return false;
    }
}
