public class mergeSort{
    public void merge(int arr[],int low,int high,int mid)
    {
        int n1=mid-low+1;
        int n2=high-mid;

        int a[]=new int[n1];
        int b[]=new int[n2];

        for(int i=0;i<n1;i++){
            a[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            b[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[n1+n2];
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                res[k++]=a[i++];
            }else{
                res[k++]=b[j++];
            }
        }
        while(i<n1){
            res[k++]=a[i++];
        }
        while(j<n2){
            res[k++]=b[j++];
        }
        for(i=0;i<res.length;i++){
            arr[low+i]=res[i];
        }

    }
    public void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;

            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);

            merge(arr,low,high,mid);
        }
    }
    public static void main(String[] args){
        mergeSort m=new mergeSort();
        int arr[]={84,3,75,92,434,85,9,82,38,749,8,43,8,3,48,53,45,8,43,95,7,93,48,58,34,95,89,843};
        int n=arr.length;
        System.out.println("Array elements before sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }
        m.mergesort(arr,0,n-1);
        System.out.println("\nArray elements after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"    ");
        }

    }
}