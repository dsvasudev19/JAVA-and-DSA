package MultipleThread;

public class MultipleThread2{
    public static void main(String[] args){
        MultipleThread t1=new MultipleThread();
        t1.setName("THREAD 1");
        MultipleThread t2=new MultipleThread();
        t2.setName("THREAD 2");
        MultipleThread1 t3=new MultipleThread1();
        t3.setName("THREAD 3");
        MultipleThread1 t4=new MultipleThread1();
        t4.setName("THREAD 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}