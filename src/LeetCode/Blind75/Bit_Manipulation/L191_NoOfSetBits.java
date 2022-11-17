package LeetCode.Blind75.Bit_Manipulation;

public class L191_NoOfSetBits {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=31;i>=0;i--){
            if(((n>>i)&1)>0){
                count++;
            }
        }
        return count;
    }
}
