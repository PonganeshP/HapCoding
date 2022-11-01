package LeetCode;

// |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|

public class L1131 {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int[] X=new int[arr1.length];
        int[] Y=new int[arr1.length];
        int[] Z1=new int[arr1.length];
        int[] Z2=new int[arr1.length];
        int xMax=Integer.MIN_VALUE;
        int xMin=Integer.MAX_VALUE;
        int yMax=Integer.MIN_VALUE;
        int yMin=Integer.MAX_VALUE;
        int z1Max=Integer.MIN_VALUE;
        int z1Min=Integer.MAX_VALUE;
        int z2Max=Integer.MIN_VALUE;
        int z2Min=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            X[i]=arr1[i]+arr2[i]+i;
            Y[i]=arr1[i]+arr2[i]-i;
            xMax=Math.max(xMax,X[i]);
            xMin=Math.min(xMin,X[i]);
            yMax=Math.max(yMax,Y[i]);
            yMin=Math.min(yMin,Y[i]);
            
            Z1[i]=arr1[i]-arr2[i]-i;
            Z2[i]=arr1[i]-arr2[i]+i;
            z1Max=Math.max(z1Max,Z1[i]);
            z1Min=Math.min(z1Min,Z1[i]);
            z2Max=Math.max(z2Max,Z2[i]);
            z2Min=Math.min(z2Min,Z2[i]);
        }
        int res1=Math.max(xMax-xMin,yMax-yMin);
        int res2=Math.max(z1Max-z1Min,z2Max-z2Min);
        int finalRes=Math.max(res1,res2);
        return finalRes;
        
    }
}
