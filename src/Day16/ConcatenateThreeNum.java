package Day16;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenateThreeNum {
    public int solve(int A, int B, int C) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(A,B,C));
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(arr.get(i)>arr.get(j)){
                    int temp=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        return arr.get(0)*10000+arr.get(1)*100+arr.get(2);

    }
}
