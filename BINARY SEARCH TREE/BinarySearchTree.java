import java.util.*;

class BinarySearchTree{
    BinarySearchTree(){

    }
    private class Node{
        int value;
        Node left;
        Node right;
        Node(){}
        Node(int item){
            this.value=item;
        }
    }
    public Node root;

    public void constructTree(Scanner sc){
        System.out.println("ENTER THE ROOT VALUE:");
        int item=sc.nextInt();
        root=new Node(item);
        constructTree(sc,root);
    }
    private Node insert(Node node,int val){
        if(node==null){
            node = new Node(val);
            return node;
        }
        if(val>node.value){
            node.right=insert(node.right,val);
        }else if(val<node.value){
            node.left=insert(node.left,val);
        }
        return node;
    }
    private void constructTree(Scanner sc,Node node){
        System.out.println("DO YOU WANT TO INSERT ELEMENTS :");
        boolean yes=sc.nextBoolean();
        if(yes){
            System.out.println("Enter the node value:");
            int n=sc.nextInt();
            insert(node,n);
            constructTree(sc,node);
        }
    
    }
    public void display(){
        System.out.println("IN-ORDER TRAVERSAL OF THE BST:");
        display(root);
    }
    private void display(Node root){
        if(root==null){
            return;
        }
        display(root.left);
        System.out.print(root.value+"    ");
        display(root.right);
    }
    public static void main(String[] args){
        System.out.println("HELLO WORLD!");
        Scanner sc=new Scanner(System.in);
        BinarySearchTree bst=new BinarySearchTree();
        bst.constructTree(sc);
        bst.display();
    }
}