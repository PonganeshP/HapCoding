package LeetCode.Blind75.Arrays;

public class L238_ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefArr=new int[nums.length];
        prefArr[0]=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            ans=ans*nums[i-1];
            prefArr[i]=ans;
        }
        int[] suffArr=new int[nums.length];
        suffArr[nums.length-1]=1;
        ans=1;
        for(int i=nums.length-2;i>=0;i--){
            ans=ans*nums[i+1];
            suffArr[i]=ans;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefArr[i]*suffArr[i];
        }
        return nums;
    }
}
