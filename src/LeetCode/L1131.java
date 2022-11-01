package LeetCode;

// |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

public class L1131 {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int finalRes=Integer.MIN_VALUE;
        int xMax=Integer.MIN_VALUE;
        int xMin=Integer.MAX_VALUE;
        
        for(int i=0;i<8;i++){
            for(int j=0;j<arr1.length;j++){
                int currSum=arr1[j];
                for(int k=0;k<2;k++){
                    int temp=0;
                    if(k==0)
                        temp=arr2[j];
                    else if(k==1)
                        temp=j;
                    if((i & (1<<k))!=0)
                        currSum+=temp;
                    else
                        currSum-=temp;
                }
                xMax=Math.max(xMax,currSum);
                xMin=Math.min(xMin,currSum);
            }
            finalRes=Math.max(xMax-xMin,finalRes);
        }
        // int xMax=Integer.MIN_VALUE;
        // int xMin=Integer.MAX_VALUE;
        // int yMax=Integer.MIN_VALUE;
        // int yMin=Integer.MAX_VALUE;
        // int z1Max=Integer.MIN_VALUE;
        // int z1Min=Integer.MAX_VALUE;
        // int z2Max=Integer.MIN_VALUE;
        // int z2Min=Integer.MAX_VALUE;
        // for(int i=0;i<arr1.length;i++){
        //     xMax=Math.max(xMax,arr1[i]+arr2[i]+i);
        //     xMin=Math.min(xMin,arr1[i]+arr2[i]+i);
        //     yMax=Math.max(yMax,arr1[i]+arr2[i]-i);
        //     yMin=Math.min(yMin,arr1[i]+arr2[i]-i);
            
        //     z1Max=Math.max(z1Max,arr1[i]-arr2[i]-i);
        //     z1Min=Math.min(z1Min,arr1[i]-arr2[i]-i);
        //     z2Max=Math.max(z2Max,arr1[i]-arr2[i]+i);
        //     z2Min=Math.min(z2Min,arr1[i]-arr2[i]+i);
        // }
        // int res1=Math.max(xMax-xMin,yMax-yMin);
        // int res2=Math.max(z1Max-z1Min,z2Max-z2Min);
        // int finalRes=Math.max(res1,res2);
        return finalRes;
    }
}
