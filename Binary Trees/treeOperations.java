public class treeOperations{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(){

        }
        Node(int data){
            this.data=data;
        }
    }
    public int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countOfNodes(root.left);
        int rightCount=countOfNodes(root.right);

        return leftCount+rightCount+1;
    }
    public int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        if(leftHeight>rightHeight){
            return leftHeight+1;
        }else{
            return rightHeight+1;
        }
    }
    public static void main(String[] args){
        treeOperations t=new treeOperations();
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);

        /**      10
         *   20      30 
         * 40 50   60  70
         *
         */
        int sum=t.sumOfNodes(root);
        System.out.println("SUM OF NODES : "+sum);
        int count=t.countOfNodes(root);
        System.out.println("COUNT OF NODES : "+count);
        int height=t.heightOfTree(root);
        System.out.println("HEIGHT OF THE TREE : "+height);
    }
}