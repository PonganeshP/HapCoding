import java.util.ArrayList;
import java.util.Arrays;

import Day02.IsPrime;
import Day05.ArrayRotation;
import Day05.GreaterThanItself;
import Day05.RangeSumQuery;
import Day05.Reverse;
import Day05.ReverseRange;
import Day05.SecondLargest;
import Day05.TimeEquality;
import Day06.EquillibriumArray;
import Day06.EvenNumberRange;
import Day06.RangeSumPrefix;
import Day07.AGsubsequence;
import Day07.Bulb;
import Day07.BuySellStock;
import Day07.ClosestMinMax;
import Day07.EvenArrays;
import Day07.PickBothSides;

public class App {
    public static void main(String[] args) throws Exception {
        // var s1=new EvenNumberRange();
        // ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(2, 1, 8, 3, 9));
        // ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>(new ArrayList<>());
        // B.add(0, new ArrayList<>(Arrays.asList(0,3)));
        // B.add(1, new ArrayList<>(Arrays.asList(2,4)));
        var s1=new EvenArrays();
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(2,4,8,7,6 ));
        System.out.println("Result: " + s1.solve(A));
    }
}
