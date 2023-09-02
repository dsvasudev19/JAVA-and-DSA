public class practice{
    public static void main(String[] args) {
        
        for(int i=1;i<10000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    private static int pow(int m, int n){
        if(m==1){
            return 1;
        }else if(n==1){
            return m;
        }else{
            return m*pow(m,n-1);
        }
    }
    private static boolean isArmstrong(int i) {
        int temp=i,sum=0,t1=i,len=0;
        while(t1>0){
            int r=t1%10;
            len++;
            t1=t1/10;
        }
        while(temp>0){
            int rem=temp%10;
            sum=sum+pow(rem,len);
            temp=temp/10;
        }
        if(sum==i){
            return true;
        }
        return false;

    }
}