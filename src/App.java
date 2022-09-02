import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import Day08.AlternateSubArrays;
import Day09.MatrixTranspose;
import Day09.MinorDiagonalSum;

public class App {
    public static void main(String[] args) throws Exception {
        // var s1=new EvenNumberRange();
        // var A=new ArrayList<Integer>(Arrays.asList(2, 1, 8, 3, 9));
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>(new ArrayList<>());
        B.add(0, new ArrayList<>(Arrays.asList(21, 62, 16, 44, 55, 100, 16, 86, 29)));
        B.add(1, new ArrayList<>(Arrays.asList(62, 72, 85, 35, 14, 1, 89, 15, 73)));
        B.add(2, new ArrayList<>(Arrays.asList(42, 44, 30, 56, 25, 52, 61, 23, 54)));
        B.add(3, new ArrayList<>(Arrays.asList(5, 35, 12, 35, 55, 74, 50, 50, 80)));
        B.add(4, new ArrayList<>(Arrays.asList(2, 65, 65, 82, 26, 36, 66, 60, 1)));
        B.add(5, new ArrayList<>(Arrays.asList(18, 1, 16, 91, 42, 11, 72, 97, 35)));
        B.add(6, new ArrayList<>(Arrays.asList(23, 57, 9, 28, 13, 44, 40, 47, 98)));
        var s1=new MatrixTranspose();
        // ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList( 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0  ));
        System.out.println("Result: " + s1.solve(B));
    }
}
