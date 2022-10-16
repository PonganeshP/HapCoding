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
public class PostOrderTraversal {
    ArrayList<Integer> res=new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if(A==null){
            return null;
        }
        inorderTraversal(A.left);
        Integer i=A.val;
        res.add(i);
        inorderTraversal(A.right);
        return res;
    }
}
