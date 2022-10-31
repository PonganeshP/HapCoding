package LeetCode;

//Best time to buy stock

public class L121 {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int minLeft=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minLeft){
                minLeft=prices[i];
            }
            int profit=prices[i]-minLeft;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
