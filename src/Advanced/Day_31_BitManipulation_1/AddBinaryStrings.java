package Advanced.Day_31_BitManipulation_1;

/*
 * Problem Description
Given two binary strings, return their sum (also a binary string)

Example:

a = "100"

b = "11"
Return a + b = "111".

 */

public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        // int l =Math.max(A.length(), B.length());
        // StringBuilder res=new StringBuilder();
        // StringBuilder revA=new StringBuilder(A);
        // StringBuilder revB=new StringBuilder(B);
        // revA.reverse();
        // revB.reverse();
        // int carry=0;
        // for(int i=0;i<l;i++){
        //     int count=carry;
        //     int digit=0;
        //     if(i<revA.length() && (Character.getNumericValue(revA.charAt(i)) & 1)==1){
        //         count++;
        //     }
        //     if(i<revB.length() && (Character.getNumericValue(revB.charAt(i)) & 1)==1){
        //         count++;
        //     }

        //     if(count==1){
        //         digit=1;
        //         carry=0;
        //         res.append(String.valueOf(digit));
        //     }
        //     else if(count==2){
        //         digit=0;
        //         carry=1;
        //         res.append(String.valueOf(digit));
        //     }
        //     else{
        //         digit=1;
        //         carry=1;
        //         res.append(String.valueOf(digit));
        //     }
            
        // }
        // if(carry==1){
        //     res.append(String.valueOf(carry));
        // }
        // res.reverse();
        // return res.toString();
        StringBuilder resStr=new StringBuilder();
        int l1=A.length();
        int l2=B.length();
        int i=1;
        int carry=0;

        while(l1-i>=0 || l2-i>=0 ){
            int count=carry;
            int digit=0;
            if(l1-i>=0 && Character.getNumericValue(A.charAt(l1-i))==1){
                count++;
            }
            if(l2-i>=0 && Character.getNumericValue(B.charAt(l2-i))==1){
                count++;
            }
            if(count==1){
                digit=1;
                carry=0;
            }
            else if(count==2){
                digit=0;
                carry=1;
            }
            else if(count==3){
                digit=1;
                carry=1;
            }
            resStr.append(digit);
            i++;
        }
        if(carry==1){
            resStr.append(carry);
        }
        resStr.reverse();
        return resStr.toString();
    }
}
