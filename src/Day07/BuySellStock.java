package Day07;

import java.util.List;

public class BuySellStock {
    public int maxProfit(final List<Integer> A) {
        int min=0;
        int profit=0;
        for(int i=0;i<A.size();i++){
            if(i==0 || A.get(i)<min){
                min=A.get(i);
            }
            if(A.get(i)-min>profit){
                profit=A.get(i)-min;
            }
        }
        return profit;
    }
}
