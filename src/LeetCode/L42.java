package LeetCode;

// Trap water

public class L42 {
    public int trap(int[] height) {
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        int n=height.length;
        leftMax[0]=0;
        rightMax[n-1]=0;
        int right=height[n-1];
        int left=height[0];
        for(int i=n-2;i>=0;i--){
            if(height[i]>right){
                right=0;
            }
            rightMax[i]=right;
            if(height[i]>right){
                right=height[i];
            }
        }
        for(int i=1;i<=n-1;i++){
            if(height[i]>left){
                left=0;
            }
            leftMax[i]=left;
            if(height[i]>left){
                left=height[i];
            }
        }
        int total=0;
        for(int i=0;i<n;i++){
            int sum=Math.min(leftMax[i],rightMax[i])-height[i];
            if(sum>0)
                total+=sum;

        }
        return total;
        
    }
}
