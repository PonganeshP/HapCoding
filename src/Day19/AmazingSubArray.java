package Day19;

public class AmazingSubArray {
    public int solve(String A) {
        StringBuilder str=new StringBuilder(A.toLowerCase());
        long count=0;
        for(int i=0;i<A.length();i++){
            if(str.charAt(i)==97 || str.charAt(i)==101 || str.charAt(i)==105 || str.charAt(i)==111 || str.charAt(i)==117){
                count+=(A.length()-i);
            }
        }
        return (int)(count%10003);
    }
}
