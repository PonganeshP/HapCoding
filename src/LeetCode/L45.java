package LeetCode;

public class L45 {
    public int jump(int[] nums) {
        int curr_pos=0;
        int temp_pos=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            temp_pos=Math.max(i+nums[i],temp_pos);
            if(curr_pos==i &&  i<nums.length-1){
                curr_pos=temp_pos;
                count++;
            }
        }
        return count;
    }
}
