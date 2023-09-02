class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DLL{
    Node insertNodeAtBeg(Node root,int data){
        Node n=new Node(data);
        n.next=root;
        root=n;

        return root;
    }
    Node insertNodeAtEnd(Node root,int data){
        Node temp=root;
        Node n=new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        n.prev=temp;
        temp.next=n;

        return root;
    }
    int lengthOfLinkedList(Node root){
        int count=0;
        Node temp=root;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    Node insertAtPosition(Node root,int data,int index){
        Node temp=root;
        Node n=new Node(data);
        int len=lengthOfLinkedList(root);
        if(index<0 || index>len){
            System.out.println("INVALID INDEX...");
            System.exit(1);
            return root;
        }
        else{
            int i=0;
            while(i<index-1 && i<len){
                i++;
                temp=temp.next;
            }
            n.next=temp.next;
            n.prev=temp;
            temp.next=n;
            return root;
        }
        

    }
    Node deleteAtBeg(Node root){
        Node temp=root;
        temp=temp.next;
        temp.prev=null;
        return temp;
    }
    Node deleteAtEnd(Node root){
        Node temp=root;
        Node prev=root;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;

        return root;
    }
    void display(Node root){
        Node temp=root;
        System.out.print("null <--- ");
        while(temp!=null){
            System.out.print(temp.data+" <--->  ");
            temp=temp.next;
        }
        System.out.println("null");
    }

}
public class DoubleLL{
    public static void main(String[] args){
        DLL dl=new DLL();
        Node root=new Node(10);
        root=dl.insertNodeAtBeg(root,20);
        root=dl.insertNodeAtEnd(root,30);
        root=dl.insertAtPosition(root,40,1);
        root=dl.deleteAtBeg(root);
        root=dl.deleteAtEnd(root);
        dl.display(root);
    }
}