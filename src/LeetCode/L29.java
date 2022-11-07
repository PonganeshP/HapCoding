package LeetCode;

// division without operator

public class L29 {
    public int divide(int dividend, int divisor) {
        long ans=0L;
        boolean sign=((dividend<0)^(divisor<0));
        
        long A=Math.abs(dividend * 1L);
        long B=Math.abs(divisor *1L);
        
        for(int i=31;i>=0;i--){
            if((B<<i)<=A){
                A-=(B<<i);
                ans+=(1<<i);
            }
        }
        if(!sign){
            ans=-ans;
        }
        if (ans >= Integer.MAX_VALUE){
            return (sign ? -Integer.MIN_VALUE : Integer.MAX_VALUE);
        }
			
        return (int)ans;
    }
}
