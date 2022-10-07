package Day22;

import java.util.Scanner;

public class PrintReverseString {
    public static String recurStr(String inp,int s,int e){
        Scanner sc=new Scanner(System.in);
        // String inp=sc.nextLine();
        StringBuilder str=new StringBuilder(inp);
        String res=recurStr(inp,0,inp.length()-1);
        System.out.println(res);
        // StringBuilder str=new StringBuilder(inp);
        if(s>=e){
            return str.toString();
        }
        Character temp=str.charAt(s);
        str.replace(s, s+1, String.valueOf(str.charAt(e)));
        str.replace(e, e+1, String.valueOf(temp));

        return recurStr(str.toString(), s+1, e-1);
    }
}
