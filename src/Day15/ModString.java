package Day15;

import java.util.ArrayList;

public class ModString{
    public int findMod(String A, int B) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<A.length();i++){
            int num=Character.getNumericValue(A.charAt(i));
            arr.add(num);
        }
        
        long t=1;
        long ans=0;
        for(int i=arr.size()-1;i>=0;i--){
            long b=arr.get(i);
            ans=(ans+(b*t))%B;
            t=(t*10)%B;
        }
        return (int)(ans%B);
    }
}