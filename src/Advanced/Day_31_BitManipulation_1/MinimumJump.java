package Advanced.Day_31_BitManipulation_1;

public class MinimumJump {
    public int solve(int[] A) {
        int curr=0;
        int farr=0;
        int jump=0;
        for(int i=0;i<A.length;i++){
            farr=Math.max(farr,i+A[i]);
            if(curr==i && i!=A.length-1){
                curr=farr;
                jump++;
            }
        }
        return jump;
    }
}
