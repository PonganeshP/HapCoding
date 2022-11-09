package LeetCode;

public class L260 {
    public int[] singleNumber(int[] nums) {
        int pos=0;
        int[] res=new int[2];
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        for(int i=0;i<31;i++){
            if(((xor)&(1<<i))>0){
                pos=i;
                break;
            }
        }
        
        int xor1=0;
        int xor2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&(1<<pos))>0){
                xor1^=nums[i];
            }
            else{
                xor2^=nums[i];
            }
        }
        res[0]=xor1;
        res[1]=xor2;
        return res;
        
    }
}
