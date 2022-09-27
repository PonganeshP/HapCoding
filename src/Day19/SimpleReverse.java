package Day19;

public class SimpleReverse {
    public String solve(String A) {
        StringBuilder res=new StringBuilder(A);
        int i =0;
        int j=A.length()-1;
        while(i<j){
            char temp=A.charAt(i);
            res.setCharAt(i, A.charAt(j));
            res.setCharAt(j, temp);
            i++;
            j--;
        }
        return res.toString();
    }
}
