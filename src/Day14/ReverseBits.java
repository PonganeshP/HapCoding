package Day14;

public class ReverseBits {
    public long reverse(long a) {
        long sum=0;
        for(int i=31;i>=0;i--){
            int lastElement=((int)a&1);
            sum+=((long)Math.pow(2,i)*lastElement);
            a=a>>1;
        }
        return sum;
	}
}
