package Advanced.Day_28_Arrays_1;

import java.util.ArrayList;
import java.util.Collections;

public class AddOne {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> resArray=new ArrayList<>();
        Collections.reverse(A);
        int carry=1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==9 && carry==1){
                resArray.add(0);
                carry=1;
            }
            else{
                resArray.add(A.get(i)+carry);
                carry=0;
            }
        }
        if(carry==1){
            resArray.add(carry);
        }
        Collections.reverse(resArray);
        for(int i=0;i<resArray.size();i++){
            if(resArray.get(0)==0){
                resArray.remove(0);
            }
            else{
                break;
            }
        }
        return resArray;
    }
}


