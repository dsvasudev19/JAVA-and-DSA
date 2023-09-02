import java.util.*;
class BinaryTree{
    BinaryTree(){
    }
    private class Node{
        int value;
        Node left;
        Node right;
        Node(int item){
            this.value=item;
        }
        
    }
    public Node root;
    public void constructTree(Scanner sc){
        System.out.println("Enter the root node value:");
        int value=sc.nextInt();
        root=new Node(value);
        constructTree(sc,root);
    }
    public void constructTree(Scanner sc,Node node){
        System.out.println("Do you want to insert to the left of "+ node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the value to be inserted");
            int n=sc.nextInt();
            node.left=new Node(n);
            constructTree(sc,node.left);
            }
        System.out.println("Do you want to insert to the right of "+node.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the value to be inserted");
            int n=sc.nextInt();
            node.right=new Node(n);
            constructTree(sc,node.right);
        }
    }
    public void display(Scanner sc){
        System.out.println("INORDER");
        inOrder(root);
        System.out.println("\nPRE-ORDER");
        preOrder(root);
        System.out.println("\nPOST-ORDER");
        postOrder(root);
        // System.out.println("ENTER THE TRAVERSAL METHOD");
        // System.out.println("1.PRE-ORDER");
        // System.out.println("2.IN-ORDER");
        // System.out.println("3.POST-ORDER");
        // int traverse=sc.nextInt();
        // switch(traverse){
        //     case 1:
        //         System.out.println("PREORDER TRAVERSAL OF THE TREE");
        //         preOrder(root);
        //         break;
        //     case 2:
        //         System.out.println("INORDER TRAVERSAL OF THE TREE");
        //         inOrder(root);
        //         break;
        //     case 3:
        //         System.out.println("POSTORDER TRAVERSAL OF THE TREE");
        //         postOrder(root);
        //         break;
        // }
    }
    private void inOrder(Node node){
        if(node==null){
            //System.out.print(-1+" ");
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+"  ");
        inOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null){
            //System.out.print(-1+" ");
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+"  ");
    }
    public void preOrder(Node node){
        if(node==null){
            //System.out.print(-1+" ");
            return;
        }
        System.out.print(node.value+"  ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void height(){
        heightOfTree(root);
    }
    public int heightOfTree(Node node){
        if(node == null){
            return 0;
        }
        int lheight=heightOfTree(node.left);
        int rheight=heightOfTree(node.right);

        return (lheight>rheight)?lheight:rheight + 1;
    }

    public static void main(String[] args){
        System.out.println("HELLO WORLD!");
        Scanner sc=new Scanner(System.in);
        BinaryTree b=new BinaryTree();
        b.constructTree(sc);
        b.display(sc);
        System.out.println("HEIGHT OF THE BINARY TREE IS : " + height() );
    }
}