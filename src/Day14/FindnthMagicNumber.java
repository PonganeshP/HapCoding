package Day14;

public class FindnthMagicNumber {
    public int solve(int A) {
        int i =0;
        int sum=0;
        while(A>0){
            int last=(A&1);
            sum+=5*last*Math.pow(5,i);
            i++;
            A=A>>1;
        }
        return sum;
    }
}
