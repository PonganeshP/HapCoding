package Day07;

import java.util.ArrayList;

public class Bulb {
    public int bulbs(ArrayList<Integer> A) {
        int switchCut=0;
        for(int i=0;i<A.size();i++){
            if(switchCut%2!=0 && switchCut!=0){
                A.set(i,A.get(i)-1);
            }
            if(A.get(i)==0){
                switchCut++;
                A.set(i,A.get(i)-1);
            }
        }
        return switchCut;
    }
}
