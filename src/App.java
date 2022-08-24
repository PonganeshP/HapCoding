import java.util.ArrayList;
import java.util.Arrays;

import Day02.IsPrime;
import Day05.GreaterThanItself;
import Day05.Reverse;
import Day05.ReverseRange;

public class App {
    public static void main(String[] args) throws Exception {
        var s1=new Reverse();
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1,2,8,4,5,10,6,3));
        System.out.println("Result: " + s1.solve(A));
    }
}
