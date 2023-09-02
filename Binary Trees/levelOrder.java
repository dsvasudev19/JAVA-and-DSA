import java.util.*;
public class levelOrder
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void levelOrder(Node root,ArrayList<Integer> l){
        Queue<Node> q=new LinkedList<>();
        
        if(root==null){
            return;
        }
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                l.add(null);
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                l.add(currNode.data);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    
                    q.add(currNode.right);
                }
            }
            
        }
    }
	public static void main(String[] args) {
		Node root=new Node(5);
		root.left=new Node(10);
		root.right=new Node(20);
		root.left.left=new Node(30);
		root.left.right=new Node(40);
		root.right.left=new Node(50);
		root.right.right=new Node(60);
		/*
		          5
		   10           20 
		 30  40       50  60
		 
		 5
		 10 20
		 30 40 50 60
		 */
		 
		 ArrayList<Integer> li=new ArrayList<>();
		 levelOrder(root,li);
         System.out.println(li);
		 for(int i=0;i<li.size();i++){
		     if(li.get(i) == null){
		         System.out.println();
		     }else{
		         System.out.print(li.get(i)+"    ");
		     }
		 }
		    
	}
}
