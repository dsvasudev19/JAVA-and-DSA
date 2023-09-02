import java.util.*;
public class binarySearch2D{
    public ArrayList<Integer> binarySearch(int arr[][],int key,ArrayList<Integer> al){
        int rows=arr.length;
        int columns=arr[0].length;
        int i=0;
        int j=columns-1;
        while(i>=0 && i<rows && j>=0 && j<columns){
            if(arr[i][j]==key){
                al.add(i);
                al.add(j);
                return al;
            }else if(key>arr[i][j]){
                i++;
            }else{
                j--;
            }
        }
        al.add(-1);
        return al;

    }
    public static void main(String[] args){
        binarySearch2D b=new binarySearch2D();

        int arr[][]={ {10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50} };
        
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> a=b.binarySearch(arr,55,res);
        System.out.print(a);
    }
}

//similar approach as binary search in 1d array 
//here mid is considered as the element at top right corner
//initiate i with 0 and j with m-1 
// i should be iterated through rows and j through columns
// top right corner element arr[i][j] --> i=0 && j=m-1
//if the key is greater than the element at top right corner
//then increment i
//else if key is less than the element at top right corner 
//then decrement j
//