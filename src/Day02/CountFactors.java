package Day02;

public class CountFactors {
    public int solve(int A) {
        int count=0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                if(i==A/i){
                    count++;
                }
                else{
                    count=count+2;
                }
            }
        }
        return count;
    }
}
