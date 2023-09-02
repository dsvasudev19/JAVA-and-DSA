public class insertionSort{
    public void insertionsort(int arr[],int n){
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int arr[]={4324,354,34,554,6,5673,43,45657,678,546,324,374,67,789,7893,54,46,7768,78,9};
		int n=arr.length;
		
		System.out.println("BEFORE SORTING");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"    ");
		}

		insertionSort s=new insertionSort();
        s.insertionsort(arr,n);
		System.out.println("\nAFTER SORTING");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"    ");
		}
    }
}