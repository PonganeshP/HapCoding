package Advanced.Day_32_BitManipulation_2;

public class SubArrayOr {
    public int solve(int[] A) {
        long n=A.length;
		long tot_subArray=(n*(n+1))/2;
		long ans=0;
		for(int i=0;i<32;i++) {
			long subArray=0;
			long bitzero=0;
			for(int j=0;j<n;j++) {
				if((A[j]&(1<<i))==0) {
					bitzero+=1;
				}
				if((A[j]&(1<<i))>0|| j==n-1) {
					subArray+=(bitzero*(bitzero+1))/2;
					bitzero=0;
				}
			}
			ans+=(tot_subArray-subArray)*(long)Math.pow(2, i);
			ans=ans%1000000007;
		}
        return (int)ans;
    }
}
