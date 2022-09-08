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
import Day09.RowToColumZero;
import Day10.MultiLeftRotate;
import Day10.SlidingWindow2;
import Day10.SpiralPrint;
import Day10.SubArrayLeastAvg;
import Day11.ConsecutiveOne;

public class App {
    public static void main(String[] args) throws Exception {
        // var s1=new EvenNumberRange();
        // var A=new ArrayList<Integer>(Arrays.asList(6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 ));
        // var B=new ArrayList<Integer>(Arrays.asList(88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 ));

        // ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>(new ArrayList<>());
        // B.add(0, new ArrayList<>(Arrays.asList(97, 18, 55, 1, 50, 17, 16, 0, 22, 14)));
        // B.add(1, new ArrayList<>(Arrays.asList(58, 14, 75, 54, 11, 23, 54, 95, 33, 23)));
        // B.add(1, new ArrayList<>(Arrays.asList(73, 11, 2, 80, 6, 43, 67, 82, 73, 4)));
        // B.add(2, new ArrayList<>(Arrays.asList(61, 22, 23, 68, 23, 73, 85, 91, 25, 7)));
        // B.add(3, new ArrayList<>(Arrays.asList(6, 83, 22, 81, 89, 85, 56, 43, 32, 89)));
        // B.add(4, new ArrayList<>(Arrays.asList(0, 6, 1, 69, 86, 7, 64, 5, 90, 37)));
        // B.add(5, new ArrayList<>(Arrays.asList(10, 3, 11, 33, 71, 86, 6, 56, 78, 31)));
        // B.add(6, new ArrayList<>(Arrays.asList(16, 36, 66, 90, 17, 55, 27, 26, 99, 59)));
        // B.add(6, new ArrayList<>(Arrays.asList(67, 18, 65, 68, 87, 3, 28, 52, 9, 70)));
        // B.add(6, new ArrayList<>(Arrays.asList(41, 19, 73, 5, 52, 96, 91, 10, 52, 21)));
        var s1=new ConsecutiveOne();
        // s1.diagonal(B);
        // ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList( 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0  ));
        System.out.println("Result: " + s1.solve("11001110"));
    }
}
