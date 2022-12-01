package LeetCode.Blind75.Arrays;

import java.util.HashMap;

public class L217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],0);
            }
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])>=2){
                return true;
            }
        }
        return false;
    }
}
