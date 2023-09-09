import java.util.Scanner;

class Node{
    Node next;
    int data;
    Node(int num){
        this.data=num;
        this.next=null;
    }
    Node(){
        this.data=0;
        this.next=null;
    }
}

class QueueLL{

    Node head;
    Node tail;
    QueueLL(){
        this.head=null;
        this.tail=null;
    }
    QueueLL(int num){
        Node n =new Node(num);
        head=n;
        tail=n;
    }

    public void queueEnqueueLL(int num){
        Node n=new Node(num);
        if(head == null){
            head=n;
            tail=head;
        }
        else{
            tail.next=n;
            tail=n;
        }

    }

    public int queueDequeueLL(){
        if(head == null){
            return (int)1e9;
        }else{
            int removedElement=head.data;
            head=head.next;
            return removedElement;
        }
    }

    public void displayQueueLL(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty queue.....");
            return;
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"    ");
                temp=temp.next;
            }
            System.out.println();
        }
        
    }

}

public class QueueLinkedList {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        QueueLL q= new QueueLL();

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
                    q.queueEnqueueLL(temp);
                    break;
                case 2:
                    int x=q.queueDequeueLL();
                    if(x==(int)1e9){
                        System.out.println("Queue under flow....");
                    }else{
                        System.out.println("Dequeued element is " +x);
                    }
                    break;
                case 3:
                    q.displayQueueLL();
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
