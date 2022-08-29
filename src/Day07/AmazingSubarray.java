package Day07;

public class AmazingSubarray {
    public int solve(String A) {
        long sum=0;
        for(int i=0; i<A.length();i++){
            if(A.charAt(i)=='A' ||A.charAt(i)=='E' ||A.charAt(i)=='I' ||A.charAt(i)=='O' ||A.charAt(i)=='U' ||A.charAt(i)=='a' ||A.charAt(i)=='e' ||A.charAt(i)=='i' ||A.charAt(i)=='o' ||A.charAt(i)=='u'){
                sum+=A.length()-1-i+1;
            }
        }
        return (int)(sum%10003);
    }
}
