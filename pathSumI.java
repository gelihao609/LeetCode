
public class pathSumI {
	public class TreeNode {
		int val;
		   TreeNode left;
		    TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null&&root.val==sum) return true;//base case
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);// use or operator, only need one case to be true, then the result is true       
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
