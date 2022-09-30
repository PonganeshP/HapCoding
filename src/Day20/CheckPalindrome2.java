package Day20;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome2 {
    public int solve(String A) {
        boolean oddFlag=true;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++){
            if(!hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i), 0);
            }
            hm.computeIfPresent(A.charAt(i), (k,v)->v=v+1);
        }
        if(A.length()%2==0){
            for(Map.Entry<Character,Integer> entry:hm.entrySet()){
                if(entry.getValue()%2!=0){
                    return 0;
                }
            }
        }
        
        else{
            for(Map.Entry<Character,Integer> entry:hm.entrySet()){
                if(entry.getValue()%2!=0 && oddFlag==true){
                    oddFlag=false;
                }
                else if(entry.getValue()%2==0){
                    continue;
                }
                else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
