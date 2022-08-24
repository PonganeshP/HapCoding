package Day05;

import java.util.ArrayList;

public class ArrayRotation {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        while(B>A.size()){
            B=B-A.size();
        }
        return 
        Reverse(
            Reverse(
            (Reverse(
                A, 0, A.size()-1))
                    ,0,B-1)
                        ,B,A.size()-1);

    }

    public ArrayList<Integer> Reverse(ArrayList<Integer> arr, int i1, int i2) {
        while(i1<i2){
            int temp=arr.get(i2);
            arr.set(i2,arr.get(i1));
            arr.set(i1,temp);
            i1++;
            i2--;
        }
        return arr;
    }
}
