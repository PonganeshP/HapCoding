package LeetCode;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.LineListener;

public class L22 {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans=new ArrayList<>();
        List<String> res=backTrace(ans,n, "", 0, 0);
        return res;
        
    }
    public List<String> backTrace(List<String> lst,int n, String S, int open, int close){
        if((open+close)==2*n){
            lst.add(S);
            return lst;
        }
        if(open<n){
            backTrace(lst,n, S+"(", open+1, close);               
        }
        if(close<open){
            backTrace(lst, n, S+")", open, close+1);
        }
        
        return lst;
        
        
    }
}
