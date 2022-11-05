package Advanced.Day_31_BitManipulation_1;

public class SingleNumber {
    public int singleNumber(final int[] A) {
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<A.length;j++){
                if((A[j]>>i & 1)==1){
                    count++;
                }
            }
            if(count%3!=0){
                ans=ans|(1<<i);
            }
        }
        return ans;
    }
}
