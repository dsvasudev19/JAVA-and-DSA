public class search{
    public int linearSearch(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
    return -1;
    }
    public int binarySearch(int arr[],int n,int key){
        int low=0;
        int high=n;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,90,3456,9568,9990};
        int n=arr.length;
        //linear search

        // int i=new search().linearSearch(arr,n,9990);
        // if(i!=-1){
        //     System.out.println("KEY FOUND AT INDEX " + i);
        // }else{
        //     System.out.println("KEY NOT FOUND");
        // }

        //binary search
        int i=new search().binarySearch(arr,n,4);
        if(i!=-1){
            System.out.println("KEY FOUND AT INDEX " + i);
        }else{
            System.out.println("KEY NOT FOUND");
        }
    }
}