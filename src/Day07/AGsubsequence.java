package Day07;

public class AGsubsequence{
    public int solve(String A) {
        int aOccurance=0;
        long ans=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='A'){
                aOccurance++;
            }
            else if(A.charAt(i)=='G'){
                ans+=aOccurance;
            }
        }
        return (int)ans%1000000007;
    }
}