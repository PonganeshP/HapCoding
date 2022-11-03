package Advanced.Day_30_Arrays_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

/*
 * Problem Description
Given a collection of intervals, merge all overlapping intervals.

Example Input
Input 1:

[1,3],[2,6],[8,10],[15,18]

Example Output
Output 1:

[1,6],[8,10],[15,18]
 */


public class MergeOverLap {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals.size() <= 0)
            return new ArrayList<>();
        
        Stack<Interval> S=new Stack<>();
        Collections.sort(intervals, new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
            
        });

        S.push(intervals.get(0));

        for (int i = 1 ; i <intervals.size(); i++)
        {
            Interval top = S.peek();
            if (top.end < intervals.get(i).start)
                S.push(intervals.get(i));
            else if (top.end < intervals.get(i).end)
            {
                top.end = intervals.get(i).end;
                S.pop();
                S.push(top);
            }
        }
        ArrayList<Interval> res=new ArrayList<>();
        while (!S.isEmpty())
        {
            Interval t = S.pop();
            res.add(t);
            
        } 
        Collections.sort(res,new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }});

        return res;


        // ArrayList<Integer> starts=new ArrayList<>();
        // ArrayList<Integer> ends=new ArrayList<>();

        // for(int i=0;i<intervals.size();i++){
        //     int s=intervals.get(i).start;
        //     int e=intervals.get(i).end;
        //     starts.add(s);
        //     ends.add(e);
        // }
        // Collections.sort(starts);
        // Collections.sort(ends);

        // ArrayList<Interval> res=new ArrayList<>();
        // int L=starts.get(0);
        // int R=ends.get(0);
        // for(int i=1;i<starts.size();i++){
        //     if(R>=starts.get(i)){
        //         R=Math.max(R, ends.get(i));
        //     }
        //     else{
        //         res.add(new Interval(L,R));
        //         L=starts.get(i);
        //         R=ends.get(i);
        //     }
        // }
        // if(L==starts.get(0)){
        //     res.add(new Interval(L,ends.get(0)));
        // }
        // return res;
    }
}
