package LeetCode;


//Guess number

public class L374 {
    public int guessNumber(int n) {
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=guess(mid);
            if(ans==0){
                return mid;
            }
            else if(ans>0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    private int guess(int mid) {
        return 0;
    }
}
