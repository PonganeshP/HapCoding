package Contest;

public class Q1{
    public int solve(int A, int B) {
        int l=A+B;
        int res=1;
        for(int i=1;i<=A;i++){
            if(i==1){
                res=res<<l-1;
            }
            else{
                int dummy=1;
                dummy=dummy<<l-1;
                res=res+dummy;
            }
            l--;
        }
        return res;
    }
}