package Day12;

import java.util.Collections;
import java.util.List;

public class NbyThreeRepeat {
    public int repeatedNumber(final List<Integer> a) {
        Collections.sort(a);
        int count=1;
        int selectedElement=a.get(0);
        if(a.size()==1){
            return a.get(0);
        }
        for(int i=1;i<a.size();i++){
            if(a.get(i)==selectedElement){
                count++;
            }
            else{
                count=0;
                count++;
                selectedElement=a.get(i);
            }
            if(count>a.size()/3){
                return selectedElement;
            }
        }
        return -1;
	}
}
