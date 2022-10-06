package Day19;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder res=new StringBuilder();
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            minLength=Math.min(A.get(i).length(), minLength);
        }
        
        int index=0;
        for(int i=0;i<minLength;i++){
            Character ch=A.get(0).charAt(index);
            for(int a=0;a<A.size();a++){
                if(A.get(a).charAt(index)!=ch){
                    return res.toString();
                }
            }
            res.append(ch);  
            index++; 
        }
        return res.toString();
    }
}
