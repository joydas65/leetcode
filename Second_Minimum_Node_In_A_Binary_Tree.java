class Solution{
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null)
            return -1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode n = (TreeNode)(q.poll());
            if(n.left != null)
                q.add(n.left);
            if(n.right != null)
                q.add(n.right);
            arr.add(n.val);
        }
        /*Collections.sort(arr);
        
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) != arr.get(i-1))
                return arr.get(i);
        }
        return -1;*/
        int min = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            min = Math.min(arr.get(i), min);
        }
        int flag = 0,ans = -1;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) != min){
                if(flag == 0){
                    ans = arr.get(i);
                    flag = 1;
                }else{
                    ans = Math.min(ans, arr.get(i));
                }
            }
        }
        return ans;
    }
}
