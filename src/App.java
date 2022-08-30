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

public class App {
    public static void main(String[] args) throws Exception {
        // var s1=new EvenNumberRange();
        // ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(2, 1, 8, 3, 9));
        // ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>(new ArrayList<>());
        // B.add(0, new ArrayList<>(Arrays.asList(0,3)));
        // B.add(1, new ArrayList<>(Arrays.asList(2,4)));
        var s1=new EvenArrays();
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList( 978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940));
        System.out.println("Result: " + s1.solve(A));
    }
}
