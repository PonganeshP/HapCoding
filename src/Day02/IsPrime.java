package Day02;

public class IsPrime {
    public int solve(Long A) {
        int count=0;
        for(long i=1;i*i<=A;i++){
            if(A%i==0){
                if(i==A/i){
                    count++;
                }
                else{
                    count=count+2;
                }
            }
        }
        if(count<=2 && A!=1){
            return 1;
        }
        return 0;
    }
}
