package Day16;

import java.util.ArrayList;

public class DivisibilityByEight {
    public int solve(String A) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=A.length()-1;i>=0;i--){
            arr.add(Character.getNumericValue(A.charAt(i)));
        }
        long t=1;
        long ans=0;
        for(int i=0;i<arr.size();i++){
            ans=(ans+(arr.get(i)*t))%8;
            t=(t*10)%8;
        }
        if(ans%8==0 || ans==0){
            return 1;
        }
        return 0;
    }
}
