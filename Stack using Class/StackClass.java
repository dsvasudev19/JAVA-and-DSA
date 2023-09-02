import java.util.*;
class Stack{
    int top;
    int arr[];
    int n;
    Stack(){
        this.top=-1;
        this.arr=new int[10];
        System.out.println("Default constructor is initiallized and created a stack capable of storing 10 elements only.....\n\n");
    }
    Stack(int n){
        this.top=-1;
        this.n=n;
        this.arr=new int[n];
        System.out.println("Stack of size "+n+" is initialized....\n\n");
    }
    void push(int ele){
        if(this.top == this.n - 1){
            System.out.println("STACK OVERFLOW.....\n CANNOT PUSH ELEMENTS INTO THE STACK....\n\n");
        }
        else{
            this.top=this.top+1;
            this.arr[this.top]=ele;
            System.out.println("Element "+ele+" pushed into the stack...\n\n");
        }
    }
    int pop(){
        if(this.top == -1){
            System.out.println("Stack is in underflow condition....\n\n");
            return -1;
        }
        else{
            int x=this.arr[this.top];
            this.top=this.top - 1;
            return x;
        }
    }
    int peek(){
        int y=this.arr[this.top];
        return y;
    }
    boolean isEmpty(){
        if(this.top == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(this.top == this.n-1){
            return true;
        }
        return false;
    }
    void displayStack(){
        int m=this.top;
        while(m>=0){
            System.out.print(this.arr[m]+"    ");
            m=m-1;
        }
        System.out.println("\n\n");
    }

}
public class StackClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("STACK DATA STRUCTURE IMPLEMENTATION USING CLASS....\n\n");
        int a;
        System.out.println("Enter the size of the stack to be initialized...");
        a=sc.nextInt();
        Stack st=new Stack(a);
        int cond=0;
        while(cond!=7){
            System.out.println("Choose operation to be performed..");
            System.out.println("1.Push element into the stack");
            System.out.println("2.Pop element from the stack");
            System.out.println("3.Peek element of the stack");
            System.out.println("4.IsEmpty");
            System.out.println("5.IsFull");
            System.out.println("6.Display the Stack");
            System.out.println("7.Exit");
            cond=sc.nextInt();
            switch(cond){
                case 1:
                int element;
                System.out.println("Enter the element to be pushed into the stack.");
                element=sc.nextInt();
                st.push(element);
                break;

                case 2:
                System.out.println("Element "+st.pop()+" popped from the stack...\n\n");
                break;

                case 3:
                System.out.println(st.peek()+" is the peek element of the stack...\n\n");
                break;

                case 4:
                if(st.isEmpty()){
                    System.out.println("Stack is Empty..\n\n");
                }
                else{
                    System.out.println("Stack is not Empty.\n\n");
                }
                break;

                case 5:
                if(st.isFull()){
                    System.out.println("Stack is FULL.\n\n");
                }
                else{
                    System.out.println("Stack is not Full.\n\n");
                }
                
                break;

                case 6:
                System.out.println("Elements of the stack are.....");
                st.displayStack();
                break;

                case 7:
                System.exit(0);

                default:
                System.out.println("Enter the correct option......\n\n");
            }

        }
    }
}