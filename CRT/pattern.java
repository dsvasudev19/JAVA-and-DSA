package CRT;

public class pattern{
    public static void main(String[] args) {
        int n;
        
        n=5;
        int a=1,b=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(a);
            }
            else if(i==2){
                System.out.println(a+" "+b);
            }
            else{
                a=1;
                b=1;
                System.out.print(a+" "+b+" ");
                for(int j=2;j<i;j++){
                    int c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }
                System.out.println();
            }
        }
    }
}