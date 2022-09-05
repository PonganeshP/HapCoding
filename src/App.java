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
import Day10.MultiLeftRotate;
import Day10.SlidingWindow2;
import Day10.SpiralPrint;
import Day10.SubArrayLeastAvg;

public class App {
    public static void main(String[] args) throws Exception {
        // var s1=new EvenNumberRange();
        var A=new ArrayList<Integer>(Arrays.asList(6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 ));
        var B=new ArrayList<Integer>(Arrays.asList(88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 ));

        // ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>(new ArrayList<>());
        // B.add(0, new ArrayList<>(Arrays.asList(1,2,3)));
        // B.add(1, new ArrayList<>(Arrays.asList(4,5,6)));
        // B.add(1, new ArrayList<>(Arrays.asList(7,8,9)));
        // B.add(2, new ArrayList<>(Arrays.asList(42, 44, 30, 56, 25, 52, 61, 23, 54)));
        // B.add(3, new ArrayList<>(Arrays.asList(5, 35, 12, 35, 55, 74, 50, 50, 80)));
        // B.add(4, new ArrayList<>(Arrays.asList(2, 65, 65, 82, 26, 36, 66, 60, 1)));
        // B.add(5, new ArrayList<>(Arrays.asList(18, 1, 16, 91, 42, 11, 72, 97, 35)));
        // B.add(6, new ArrayList<>(Arrays.asList(23, 57, 9, 28, 13, 44, 40, 47, 98)));
        var s1=new MultiLeftRotate();
        // s1.diagonal(B);
        // ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList( 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0  ));
        System.out.println("Result: " + s1.solve(A,B));
    }
}
