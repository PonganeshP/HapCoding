package Day23;

public class PowerFunction {
    public int pow(int A, int B, int C) {
        if(A==0){
            return 0;
        }
        if(B==0){
            return 1;
        }
        A=(A+C)%C;
        long p=pow(A, B/2, C);
        if(B%2==0){
            return (int)((p*p)%C);
        }
        return (int)((((p*p)%C)*A)%C);
    }
}
