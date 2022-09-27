package Day19;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        // int start=0;
        // int end=0;
        // int ans=1;
        StringBuilder res=new StringBuilder("");
        // for(int i=0;i<A.length();i++){
        //     for(int j=i+1;j<A.length();j++){
        //         if(isPalindrome(A,i,j)){
        //             int len=j-i+1;
        //             if(len>ans){
        //                 ans=len;
        //                 start=i;
        //                 end=j;
        //             }
        //         }
        //     }
        // }
        // for(int i=start;i<=end;i++){
        //     res.append(A.charAt(i));
        // }
        // return res.toString();
        int ans=1;
        int start=0;
        int end=0;
        if(A.length()==1){
            return A;
        }
        if(A.charAt(A.length()-1)==A.charAt(A.length()-2)){
            start=A.length()-2;
            end=A.length()-1;
        }
        for(int i=1;i<A.length()-1;i++){
            int loop=i;
            int inc=1;
            while(loop>0 && i+inc<A.length()){
                int j=i;
                int bef=j-inc;
                int aft=j+inc;
                if(A.charAt(bef)!=A.charAt(aft)){
                    // if(A.charAt(j)==A.charAt(j+1)){
                    //     bef=j-inc;
                    //     aft=j+inc+1;
                    // }
                    break;
                }
                
                else{
                    int l=aft-bef+1;
                    if(l>ans){
                        ans=l;
                        start=bef;
                        end=aft;
                    }
                }
                inc++;
                loop--;
            }
            inc=1;
            while(i+inc+1<A.length() && i-inc>=0){
                int j=i;
                int bef=j-inc;
                int aft=j+inc;
                if(A.charAt(j)==A.charAt(j+1)){
                    if(2>ans){
                        start=j;
                        end=j+1;
                    }
                        bef=j-inc;
                        aft=j+inc+1;
                        if(A.charAt(bef)==A.charAt(aft)){
                            int l=aft-bef+1;
                            if(l>ans){
                            ans=l;
                            start=bef;
                            end=aft;
                    }

                        }
                        else{
                            break;
                        }
                        
                }
                
                else{
                    break;
                }
                inc++;
            }
        }
        for(int i=start;i<=end;i++){
                res.append(A.charAt(i));
            }
            return res.toString();

    }
    // public boolean isPalindrome(String A,int a, int b){
    //     while(a<b){
    //         if(A.charAt(a)!=A.charAt(b)){
    //             return false;
    //         }
    //         a++;
    //         b--;
    //     }
    //     return true;
    // }
}
