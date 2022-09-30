package Day20;

import java.util.HashMap;
import java.util.Map;

public class ColorfulNumber {
    public int colorful(int A) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int previousDigit=-1;
        while(A>0){
            int digit=A%10;
            if(!hm.containsKey(digit)){
                if(hm.containsValue(previousDigit*digit)){
                    return 0;
                }
                hm.put(digit, previousDigit*digit);
                previousDigit=digit;
            }
            else{
                return 0;
            }
            
            A=A/10;
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(hm.containsKey(entry.getValue())){
                return 0;
            }
        }
        return 1;
    }
}
