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
import Day06.RangeSumPrefix;

public class App {
    public static void main(String[] args) throws Exception {
        var s1=new EquillibriumArray();
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4));
        // ArrayList<ArrayList<Integer>> B=new ArrayList<>();
        // ArrayList<Integer> c1=new ArrayList<>(Arrays.asList(1,4));
        // ArrayList<Integer> c2=new ArrayList<>(Arrays.asList(2,3));
        // B.add(c1);
        // B.add(c2);

        System.out.println("Result: " + s1.solve(A));
    }
}
