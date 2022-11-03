package LeetCode;

import java.util.Arrays;
import java.util.Stack;

//Merge Intervals

public class L56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=0){
            return new int[0][0];
        }
        Stack<int[]> Stac=new Stack<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        Stac.push(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] top=Stac.peek();
            if(top[1]>=intervals[i][0]){
                int S=top[0];
                int E=Math.max(top[1],intervals[i][1]);
                Stac.pop();
                int[] dummy=new int[2];
                dummy[0]=S;
                dummy[1]=E;
                Stac.push(dummy);
            }
            
            else{
                Stac.push(intervals[i]);
            }
        }
        int[][] res=new int[Stac.size()][intervals[0].length];
        int i=Stac.size()-1;
        while(!Stac.isEmpty()){
            int[] temp=Stac.pop();
            res[i]=temp;
            i--;
        }

        return res;
        
    }
}
