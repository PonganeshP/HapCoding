public class L371_SumInt {
    public int getSum(int a, int b) {
        int ans=0;
        int carry=0;
        boolean neg_sign=false;
        neg_sign=(a<0)^(b<0)?true:false;
        boolean s=false;
        if(a<0 || b<0){
            s=true;
        }
        
        if(neg_sign){
            int max=Math.max(a,b);
            int min=Math.min(a,b);
            int res=Math.abs(max)-Math.abs(min);
            if(max<0){
                return -res;
            }
            return res;
        }
        
        
        a=Math.abs(a);
        b=Math.abs(b);
        
        for(int i=0;i<31;i++){
            int count=carry;
            if((a&(1<<i))>0){
                count++;
            }
            if((b&(1<<i))>0){
                count++;
            }
            
            if(count==1){
                ans=ans|(1<<i);
                carry=0;
            }
            else if(count==2){
                carry=1;
            }
            else if(count==3){
                ans=ans|(1<<i);
                carry=1;
            }
        }
        
        
        if(s){
            ans=-ans;
        }
        return ans;
    }
}
