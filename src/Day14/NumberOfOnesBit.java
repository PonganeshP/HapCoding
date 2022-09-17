package Day14;

public class NumberOfOnesBit {
    public int numSetBits(int A) {
        int count=0;
        while(A>0){
            int rem=A%2;
            if(rem==1){
                count++;
            }
            A=A/2;
        }
        return count;
    }
}
