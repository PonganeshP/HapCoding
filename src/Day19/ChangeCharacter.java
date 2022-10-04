package Day19;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeCharacter {
    public int solve(String A, int B) {
        ArrayList<Integer> arr=new ArrayList<>();
       for(int i=0;i<26;i++){
        int alpa=i+97;
        int count=0;
            for(int j=0;j<A.length();j++){
                if(A.charAt(j)==alpa){
                    count++;
                }
            }
            if(count>0){
                arr.add(count);
            }
       }
       Collections.sort(arr);
       int pointer=0;
       for(int i=1;i<=B;i++){
        if(pointer<arr.size() && arr.get(pointer)>0){
            arr.set(pointer,arr.get(pointer)-1);
            if(arr.get(pointer)==0){
                pointer++;
            }
        }
        else{
            pointer++;
        }
       }
       int resCount=0;
       for(int i=0;i<arr.size();i++){
        if(arr.get(i)!=0){
            resCount++;
        }
       }
        return resCount;
    }
}
