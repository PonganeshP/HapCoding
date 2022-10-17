package Day26;

import java.util.ArrayList;

public class PreOrderTraversal {
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
    ArrayList<Integer> res=new ArrayList<>();
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        if(A==null){
            return null;
        }
        Integer i=A.val;
        res.add(i);
        preorderTraversal(A.left);
        preorderTraversal(A.right);
        return res;
    }
}
