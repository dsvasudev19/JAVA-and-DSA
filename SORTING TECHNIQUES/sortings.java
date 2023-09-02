public class sortings{
    public void bubbleSort(int arr[],int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public void selectionSort(int arr[],int n){
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]={73,49,8,57,9,8,34,7,50,93,2,48,3,9,0,48,57,9,34,85,73,4,98,5,35};
		System.out.println("Array elements before sorting:");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+"   ");
		}
		sortings m=new sortings();
		//m.bubbleSort(arr,arr.length);
        // m.insertionSort(arr,arr.length);
        m.selectionSort(arr,arr.length);
		System.out.println("\nArray elements after sorting:");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+"   ");
		}
    }
}