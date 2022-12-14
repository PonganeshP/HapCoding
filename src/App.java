import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Advanced.Day_28_Arrays_1.ContinuosSumQuery;
import Advanced.Day_28_Arrays_1.Flip;
import Advanced.Day_29_Arrays_2.MaxSubMatrixSum;
import Advanced.Day_29_Arrays_2.MaxSumSubSquare;
import Advanced.Day_29_Arrays_2.MinimumSwaps;
import Advanced.Day_29_Arrays_2.SortMinimumSwap;
import Advanced.Day_29_Arrays_2.SpiralMatrix;
import Advanced.Day_29_Arrays_2.SubMatrixSumQuery;
import Advanced.Day_30_Arrays_3.MergeIntervals;
import Advanced.Day_30_Arrays_3.NextPermutation;
import Advanced.Day_30_Arrays_3.NumberOfDigitOne;
import Advanced.Day_30_Arrays_3.TrapWater;
import Advanced.Day_31_BitManipulation_1.AddBinaryStrings;
import Advanced.Day_31_BitManipulation_1.MinimumJump;
import Advanced.Day_31_BitManipulation_1.SingleNumber;
import Advanced.Day_32_BitManipulation_2.MinXor;
import Advanced.Day_32_BitManipulation_2.StrangeEquality;
import Advanced.Day_32_BitManipulation_2.SubArrayOr;
import Advanced.Day_33_Modular_Arithmatic.VeryLargePower;
import Advanced.Day_34_GCD.AllGCDPairs;
import Advanced.Day_34_GCD.DeleteOne;
import Advanced.Day_35_PrimeNumber.CountDivisor;
import Advanced.Day_36_Combinatronics.ComputeNCR;
import Advanced.Day_37_Recursion.MagicNumber;
import Advanced.Day_39_Sorting_1.KthSmallestElement;
import Advanced.Day_40_Sorting_2.BClosestOrigin;
import Advanced.Day_40_Sorting_2.InversionCount;
import Advanced.Day_40_Sorting_2.LargeNumber;
import Advanced.Day_40_Sorting_2.ReversePairs;
import Advanced.Day_40_Sorting_2.UniqueElement;
import Advanced.Day_41_Sorting_3.QuickSort;
import Advanced.Day_42_BinarySearch.FindIndex;
import Advanced.Day_42_BinarySearch.FindPeak;
import Advanced.Day_42_BinarySearch.FindRotatedElement;
import Advanced.Day_43_BinarySearch_2.SquareRootInt;
import Advanced.Day_44_BinarySearch_3.AggressiveCows;
import Advanced.Day_44_BinarySearch_3.PainterPartition;
import Advanced.Day_45_TwoPointers.SubbArraySum;
import Advanced.Day_46_Hashing.DistinctNumInWindow;
import Advanced.Day_46_Hashing.LargestZeroSequnce;
import Contest.G2;
import Day13.InterestingArray;
import Day21.IsValidSudoku;
import LeetCode.L1131;
import LeetCode.L22;
import LeetCode.L41;
import LeetCode.L42;
import LeetCode.L45;
import LeetCode.L56;


public class App {
    public static void main(String[] args) throws Exception {
        // var s1=new EvenNumberRange();Integer
        // int[][] A={{26, 41},{40, 47},{47, 7},{50, 34},{18, 28}};
        int[] B = {1, 1, 2, 2};
        int[] C = {0,-2,-1,-7,-4};
        int[] D = {2, 3};
        int[] E = {2, 3};
        var A=new ArrayList<Integer>(Arrays.asList(1,1000000000));
        // var B=new ArrayList<String>(Arrays.asList("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));

        // ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>(new ArrayList<>());
        // B.add(0, new ArrayList<>(Arrays.asList(2,6)));
        // B.add(1, new ArrayList<>(Arrays.asList(4,7)));
        // B.add(1, new ArrayList<>(Arrays.asList(6,7)));
        // // B.add(2, new ArrayList<>(Arrays.asList(61, 22, 23, 68, 23, 73, 85, 91, 25, 7)));
        // // B.add(3, new ArrayList<>(Arrays.asList(6, 83, 22, 81, 89, 85, 56, 43, 32, 89)));
        // // B.add(4, new ArrayList<>(Arrays.asList(0, 6, 1, 69, 86, 7, 64, 5, 90, 37)));
        // // B.add(5, new ArrayList<>(Arrays.asList(10, 3, 11, 33, 71, 86, 6, 56, 78, 31)));
        // // B.add(6, new ArrayList<>(Arrays.asList(16, 36, 66, 90, 17, 55, 27, 26, 99, 59)));
        // // B.add(6, new ArrayList<>(Arrays.asList(67, 18, 65, 68, 87, 3, 28, 52, 9, 70)));
        // // B.add(6, new ArrayList<>(Arrays.asList(41, 19, 73, 5, 52, 96, 91, 10, 52, 21)));
        var s1=new DistinctNumInWindow();
        // s1.diagonal(B);
        // ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList( 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0  ));
        System.out.println("Result: " + Arrays.toString(s1.dNums(B,1)) );




        // Scanner myObj = new Scanner(System.in);
        //   // Create a Scanner object
        // System.out.println('N, M, Q: ');
        // String line1 = myObj.nextLine();
        // line1.replaceAll('\\s', '');
        // int N=Character.getNumericValue(line1.charAt(0));
        // int M=Character.getNumericValue(line1.charAt(1));
        // int Q=Character.getNumericValue(line1.charAt(2));
        // System.out.println('Query1: ');
        // String q1 = myObj.nextLine();
        // int C1=Character.getNumericValue(q1.charAt(0));
        // int C2=Character.getNumericValue(q1.charAt(1));
        // System.out.println('Query2: ');
        // String q2 = myObj.nextLine();
        // int R1=Character.getNumericValue(q2.charAt(0));
        // int R2=Character.getNumericValue(q2.charAt(1));
        // System.out.println('Query3: ');
        // String q3 = myObj.nextLine();
        // int X1=Character.getNumericValue(q3.charAt(0));
        // int Y1=Character.getNumericValue(q3.charAt(1));
        // int X2=Character.getNumericValue(q3.charAt(3));
        // int Y2=Character.getNumericValue(q3.charAt(4));
        // System.out.println('Query4: ');
        // String q4 = myObj.nextLine();
        // int X3=Character.getNumericValue(q4.charAt(0));
        // int Y3=Character.getNumericValue(q4.charAt(1));
        // int X4=Character.getNumericValue(q4.charAt(3));
        // int Y5=Character.getNumericValue(q4.charAt(4));

        // ArrayList<ArrayList<Integer>> A= new ArrayList<>();
        // int num=1;
        // for(int i=0;i<2;i++){
        //     A.add(new ArrayList<Integer>());
        // }
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         A.get(i).add(j,num);
        //         num++;
        //     }
        // }
        // for(int i=0;i<2;i++){
        //     int e1=A.get(i).get(1);
        //     int e2=A.get(i).get(0);
        //     int temp=e2;
        //     e2=e1;
        //     e1=temp;
        //     A.get(i).set(1,e2);
        //     A.get(i).set(0,e1);
        // }
        // for(int i=0;i<3;i++){
        //     int e1=A.get(1).get(i);
        //     int e2=A.get(1).get(i);
        //     int temp=e2;
        //     e2=e1;
        //     e1=temp;
        // }

        // System.out.println(A);
    }
}
