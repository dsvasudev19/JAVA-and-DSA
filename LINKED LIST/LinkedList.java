class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node insertNodeAtEnd(Node root,int data){
        Node n=new Node(data);
        Node temp=root;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.next=null;
        return root;
    }
    Node insertNodeAtBeg(Node root,int data){
        Node n=new Node(data);
        n.next=root;
        root=n;

        return root;
    }
    
    int lengthOfLinkedList(Node root){
        Node temp=root;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    Node insertAtPosition(Node root,int data,int index){
        Node n=new Node(data);
        Node temp=root;
        if(index>lengthOfLinkedList(root)){
            System.out.print("INSERTION NOT POSSIBLE OR INVALID INDEX.....");
            return root;
        }
        else if(index<0){
            System.out.print("INVALID INDEX...");
            return root;
        }
        else if(index==0){
            n.next=root;
            root=n;
            return root;
        }
        else{
            int i=0;
            while(i<index-1 && i<lengthOfLinkedList(root)){
                temp=temp.next;
                i++;
            }
            n.next=temp.next;
            temp.next=n;
            return root;
        }
    }
    Node deleteAtBeg(Node root){
        root=root.next;
        return root;
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
        while(temp!=null){
            System.out.print(temp.data+" --->  ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedList{
    public static void main(String[] args){
        LL l=new LL();
        Node root=new Node(10);
        
        root=l.insertNodeAtBeg(root,20);
        
        root=l.insertNodeAtEnd(root,30);
        root=l.insertNodeAtBeg(root,50);
        
        root=l.insertAtPosition(root,60,2);
        
        
        root=l.insertAtPosition(root,70,0);
        root=l.insertAtPosition(root,80,1);
        root=l.deleteAtBeg(root);
        // root=l.deleteAtEnd(root);
        l.display(root);

    }

}