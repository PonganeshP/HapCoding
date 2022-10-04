package Day19;

public class StringOperations {
    public String solve(String A) {
        StringBuilder str=new StringBuilder(A);
        StringBuilder res=new StringBuilder();
        str.append(A);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                continue;
            }
            else{
                res.append(str.charAt(i));
            }
        }
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)==97 || res.charAt(i)==101 ||res.charAt(i)==105 ||res.charAt(i)==111 ||res.charAt(i)==117){
                res.replace(i, i+1, "#");
            }
        }
        return res.toString();
    }
}
