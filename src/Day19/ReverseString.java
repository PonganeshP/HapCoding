package Day19;

import java.util.Arrays;

public class ReverseString {
    public String solve(String A) {
        String res="";
        String[] strArr=A.split(" ");
        for(int i=strArr.length-1;i>=0;i--){
            res+=strArr[i]+" ";
        }
        return res.trim();
    }
}
