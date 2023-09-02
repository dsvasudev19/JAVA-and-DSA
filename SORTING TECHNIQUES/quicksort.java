import java.util.*;

public class quicksort
{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                
                //swap 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        
        return i;
    }
    public static void quickSort(int arr[],int start,int end){
        if(start<end){
            int pivot=partition(arr,start,end);
            
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
	public static void main(String[] args) {
		int arr[]={4324,354,34,554,6,5673,43,45657,678,546,324,374,67,789,7893,54,46,7768,78,9};
		int n=arr.length;
		
		System.out.println("BEFORE SORTING");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"    ");
		}

		quickSort(arr,0,n-1);
		System.out.println("\nAFTER SORTING");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"    ");
		}
	}
}
