package Advanced.Day_37_Recursion;

public class RevereseString {
    public static String reverse(String s){
        if(s.length()==0){
            return "";
        }
        return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
    }
}
