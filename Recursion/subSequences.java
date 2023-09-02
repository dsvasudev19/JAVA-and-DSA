import java.util.*;



public class subSequences{
    private static void printSubSequences(int i,int n,int []arr,ArrayList<Integer> out){
        if(i>=n){
            System.out.println(out);
            return;
        }
        //not take element into the output and move to the next index
        printSubSequences(i+1,n,arr,out);

        //take element into the output and move to the next index
        out.add(arr[i]);
        printSubSequences(i+1,n,arr,out);
        out.remove(Integer.valueOf(arr[i]));
    }
    public static void main(String[] args){
        
            


        int arr[]={2,5,6,9,10,12};
        int n=arr.length;
        
        ArrayList<Integer> out=new ArrayList<>();
        

        printSubSequences(0,n,arr,out);
        
    }
}
