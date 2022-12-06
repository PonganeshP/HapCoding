package Advanced.Day_40_Sorting_2;

import java.util.Arrays;
import java.util.Comparator;

public class LargeNumber {
    public String largestNumber(final int[] A) {
        String[] arr=new String[A.length];
        boolean flag=true;
        for(int i=0;i<A.length;i++){
            if(flag && A[i]!=0){
                flag=false;
            }
            arr[i]=String.valueOf(A[i]);
        }
        if(flag){
            return "0";
        }
        Arrays.sort(arr,(String s1, String s2)->
            (s1+s2).compareTo(s2+s1)
        );
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i];
        }
        return res;
    }
}
