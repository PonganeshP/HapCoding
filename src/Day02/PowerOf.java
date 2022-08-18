package Day02;

public class PowerOf {
    
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int power(final int A, final int B) {
        //Naive approach
        // int result=1;
        // if(B==0){
        //     return 1;
        // }
        // else if(B==1){
        //     return A;
        // }
        // for(int i=1;i<=B;i++){
        //     result=result*A;
        // }
        // return result;
        if(B==0){
            return 1;
        }
        int temp=power(A,B/2);
        if(B%2>0){
            return temp*temp*A;
        }
            return temp*temp;
    }
}
