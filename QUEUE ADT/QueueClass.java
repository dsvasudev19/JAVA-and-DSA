import java.util.Scanner;

class queue {
    static public int front;
    static public int rear;
    static public int length;
    static public int size;
    static public int queue[];

    queue(int n) {
        
        front = 0;
        rear = 0;
        length = 0;
        size = n;
        queue = new int[n];
    }

    public void queueEnqueue(int num) {
        if (rear == size) {
            System.out.println("Queue is full ...... / Queue overflow");
            return;
        } else {
            queue[rear++] = num;
            length++;
        }
    }

    public int queueDequeue() {
        if (front == rear) {
            return (int) 1e9;
        } else {
            int x = queue[front];
            front++;
            return x;
        }
    }

    public void displayQueue() {
        if (front == rear) {
            System.out.println("Empty queue");
            return;
        }
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+"    ");
        }
        System.out.println();
    }

}

public class QueueClass {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum size of the queue: ");
        int n = sc.nextInt();

        queue q = new queue(n);

        int choice=0;
        while(choice!=4){
            System.out.println("choose the operation : ");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            choice=sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter the element to be inserted: ");
                int temp=sc.nextInt();
                q.queueEnqueue(temp);
                break;
                case 2:
                int x=q.queueDequeue();
                if(x==(int)1e9){
                    System.out.println("Queue under flow....");
                }else{
                    System.out.println("Dequeued element is " +x);
                }
                break;
                case 3:
                q.displayQueue();
                break;
                case 4:
                sc.close();
                System.exit(0);
                default:
                System.out.println("please choose the correct option .... ");
            }

        }
        

    }
}