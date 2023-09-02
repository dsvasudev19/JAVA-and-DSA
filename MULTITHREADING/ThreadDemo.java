import java.lang.*;
class ThreadDemo extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread());
            System.out.println("THREAD ID IS : "+Thread.currentThread().getId());
            System.out.println(i);

            // try{
            //     Thread.sleep(100);
            // }catch(Exception e){

            // }
        }

    }
    public static void main(String[] args){
        ThreadDemo t1=new ThreadDemo();
        // setting the name of the thread
        t1.setName("THREAD 1");
        ThreadDemo t2=new ThreadDemo();
        t2.setName("THREAD 2");
        ThreadDemo t3=new ThreadDemo();
        t3.setName("THREAD 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("MAIN THREAD IN EXECUTION");
    }
}


/*
WHEN A CLASS EXTENDS THREAD CLASS THEN THE OBJECT OF USER CLASS IS ALSO AN OBJECT

OF THREAD CLASS BUT 

WHEN A CLASS IMPLEMENTS RUNNABLE INTERFACE THE THE OBJECT OF USER CLASS IS NOT

AN OBJECT OF INTERFACE

WHEN IMPLEMENTING RUNNABLE INTERFACE WE HAVE TO CREATE THE OBJECT OF THE USER 

CLASS AND THEN PASS IT TO Thread t=new Thread(obj);

HERE obj IS THE OBJECT OF USER CLASS CREATED BY USER.

*/