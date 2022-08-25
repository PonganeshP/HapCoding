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

public class App {
    public static void main(String[] args) throws Exception {
        var s1=new TimeEquality();
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(731, 349, 490, 781, 271, 405, 811, 181, 102, 126, 866, 16, 622, 492, 194, 735));
        // ArrayList<ArrayList<Integer>> B=new ArrayList<>();
        // ArrayList<Integer> c1=new ArrayList<>(Arrays.asList(1,4));
        // ArrayList<Integer> c2=new ArrayList<>(Arrays.asList(2,3));
        // B.add(c1);
        // B.add(c2);

        System.out.println("Result: " + s1.solve(A));
    }
}
