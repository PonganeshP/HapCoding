package LeetCode.Blind75.Bit_Manipulation;

public class L338_ArrayCountOfSets {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=res.length-1;i>=0;i--){
            res[i]=countOfSet(i);
        }
        return res;
    }
    public int countOfSet(int a){
        int count=0;
        for(int i=30;i>=0;i--){
            if(((a>>i)&1)>0)
                count++;
        }
        return count;
    }
}
