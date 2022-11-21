package Advanced.Day_35_PrimeNumber;

public class LuckyNum {
    public int solve(int A) {
        int[] countArr=new int[A+1];
        for(int i=2;i<=A;i++){
            if(countArr[i]==0){
                for(int j=i;j<=A;j+=i){
                    countArr[j]++;
                }
            }
        }
        int res=0;
        for(int i=2;i<=countArr.length-1;i++){
            if(countArr[i]==2){
                res++;
            }
        }
        return res;
    }
}
