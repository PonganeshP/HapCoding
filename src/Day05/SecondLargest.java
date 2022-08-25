package Day05;

import java.util.ArrayList;

public class SecondLargest {public int solve(ArrayList<Integer> A) {
    int max1=0;
    int max2=0;
    int maxCount=0;
    if(A.size()==1){
        return -1;
    }
    for(int i=0;i<A.size();i++){
        if(A.get(i)>max1 || i==0){
            max1=A.get(i);
            maxCount=0;
        }
        if(A.get(i)==max1){
            maxCount++;
        }
    }
    if(maxCount>=2){
        return max1;
    }
    else{
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max2 && A.get(i)!=max1){
                max2=A.get(i);
            }
        }
    }
    return max2;
}
}
