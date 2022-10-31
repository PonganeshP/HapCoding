package LeetCode;

import java.util.HashMap;
import java.util.Map;

//Two sum

public class L1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(target-nums[i])){
                hm.put(nums[i],i);
            }
            else{
                res[0]=hm.get(target-nums[i]);
                res[1]=i;
                break;
            }
        }
        return res;
    }
}
