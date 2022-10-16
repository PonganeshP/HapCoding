package Day26;

import java.util.ArrayList;
class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }
public class HeightOfTree {
    public int solve(TreeNode A) {
        if(A==null){
            return 0;
        }
        return (1+Math.max(solve(A.left),solve(A.right)));
    }
}
