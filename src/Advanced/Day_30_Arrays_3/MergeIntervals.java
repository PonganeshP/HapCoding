package Advanced.Day_30_Arrays_3;

import java.util.ArrayList;

/*
 * Problem Description
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example Input
Input 1:

Given intervals [1, 3], [6, 9] insert and merge [2, 5] 

Example Output
Output 1:

 [ [1, 5], [6, 9] ]
 */

public class MergeIntervals {
    public class Interval {
            int start;
            int end;
            Interval() { start = 0; end = 0; }
            Interval(int s, int e) { start = s; end = e; }
        }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // ArrayList<Interval> intervals=new ArrayList<>();
        // intervals.add(new Interval(1,3));
        // intervals.add(new Interval(6,9));
        // Interval newInterval=new Interval(2,5);
        ArrayList<Interval> res=new ArrayList<>();
        for(int i=0;i<intervals.size();i++){
            if(newInterval.end<intervals.get(i).start){
                res.add(newInterval);
                res.addAll(intervals.subList(i,intervals.size()));
                return res;
            }
            else if(newInterval.start>intervals.get(i).end){
                res.add(intervals.get(i));
            }
            else{
                newInterval=new Interval(Math.min(newInterval.start, intervals.get(i).start),Math.max(newInterval.end, intervals.get(i).end));
            }
        }
 
        res.add(newInterval);

        return res;

    }
}
