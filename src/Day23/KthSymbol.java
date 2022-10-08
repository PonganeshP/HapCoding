package Day23;

public class KthSymbol {
    public int solve(int A, int B) {
        if(A==1){
            return 0;
        }
        int parent=solve(A-1, (B/2)+(B%2));
        if(parent==1){
            if(B%2==1){
                return 1;
            }
            return 0;
        }
        else{
            if(B%2==1){
                return 0;
            }
            return 1;
        }
    }
    
}
