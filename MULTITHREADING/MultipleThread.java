
package MultipleThread;
import java.lang.*;
public class MultipleThread extends Thread{
    
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread());
            System.out.println(i);
        }
    }
}
class MultipleThread1 extends Thread{

    public void run(){
        for(int i=10;i>=6;i--){
            System.out.println(Thread.currentThread());
            System.out.println(i);
        }
    }
}