package Advanced.Day_32_BitManipulation_2;

public class MaxAndPair {
    public int solve(int[] A) {
        int ans=0;
        for(int pos=30;pos>=0;pos--){
            int count=0;
            for(int i=0;i<A.length;i++){
                if((A[i]&(1<<pos))>0){
                    count++;
                }
            }
            if(count>=2){
                for(int i=0;i<A.length;i++){
                    if((A[i]&(1<<pos))==0){
                        A[i]=0;
                    }
                }
                
                ans=ans|(1<<pos);
            }
        }
        return ans;
    }
}
