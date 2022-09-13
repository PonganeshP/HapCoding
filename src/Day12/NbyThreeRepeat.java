package Day12;

import java.util.Collections;
import java.util.List;


//Problem Description
// You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
// If so, return the integer. If not, return -1.

// If there are multiple solutions, return any one.

// Example Input
// [1 2 3 1 1]


// Example Output
// 1



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
