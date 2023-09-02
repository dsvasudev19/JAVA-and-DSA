import java.util.Scanner;


//Implementation of the array using the concept of class
//author:ds.vasudev
//url for github repository https://github.com/dsvasudev19


class Array{
    Scanner sc=new Scanner(System.in);
    int size;
    int length;
    int arr[];

    //constructor with size and length as parameter
    Array(int size,int length){
        this.size=size;
        this.length=length; 
        this.arr=new int[size];
        if(this.length>=this.size){
            System.out.println("Error length of the array should be less than the maximum size of the array !!!!!!!\n\n\n");
        }
    }

    //constructor when only size is mentioned
    Array(int size){
        this.size=size;
        this.arr=new int[size];
    }

    //default constructor with no parameters
    Array(){
        System.out.println("DEFAULT CONSTRUCTOR INITIALIZED\n\n\n");
    }

    //function for the construction of an array

    void constructArray(){
        int x;
        //reading input from the user for number of elements in the array

        System.out.println("Enter the length of the array : ");
        x=sc.nextInt();
        this.length=x;
        //checking if the input entered by user is 0 if so we have to ask again as length of the array cannot be 0 while construction
        if(this.length == 0){
            System.out.println("ENTER THE LENGTH OF THE ARRAY WHICH IS GREATER THAN ZERO : ");
            this.length=sc.nextInt();
        }
        //checking if the input entered by user is greater than the size of the array because length of the array cannot be greater than size of the array
        else if(x>this.size){
            System.out.println("Length of the array cannot be greater than the maximum capacity of the array .....!");
            System.exit(0);
        }
        //if all the values are accordingly entered then start the process of constructing the array by asking user to enter the array elements
        else{
            System.out.println("Enter array elements");
            for(int i=0;i<length;i++){
                this.arr[i]=sc.nextInt();
            }
        }
        System.out.println("\n\n\n");
    }

    //function for displaying the array elements
    void displayArray(){
        //check if the length of the array is 0 or not
        if(length==0){
            System.out.println("Array has no elements in it\n\n");
        }
        //if not 0 then continue displaying elements in the array
        else{
            System.out.println("\nArray elements are :");
            for(int i=0;i<this.length;i++){
                System.out.print(this.arr[i]+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n\n");
    }

    //funcion for inserting elements only at the end of the array...
    void insertElement(int ele){
        //if the current length of the array is equal to the size of the array then inserting is not possible 
        if(this.length ==  this.size){
            System.out.println("Insertion not available as the array is full......!");
            System.out.println("Array under overflow condition\n\n\n\n");
        }
        //if current length is less than the size of the array then insertion is possible
        //insert the element at the end of the array and increment the length of the array
        else{
            this.arr[length]=ele;
            this.length=this.length+1;
            System.out.println("Element " + ele + " inserted into the array .....!\n\n\n");
        }
    }
     

    //function to return the size of the array
    int getSizeoftheArray(){
        return this.size;
    }
    
    //function to return the length of the array
    int getlengthoftheArray(){
        return this.length;

    }
    
    //function for deleting the specified element
    void deleteElementFromArray(int ele){
        int count=0;
        //count variable is for the count of mentioned element in the array
        for(int i=0;i<this.length;i++){
            if(this.arr[i] == ele){
                int j=i;
                count++;
                while(j<this.length-1){
                    this.arr[j]=this.arr[j+1];
                    j++;
                }
            }
        }
        if(count == 0){
            System.out.println("THERE IS NO SUCH ELEMENT WITH VALUE "+ele);
            System.out.println("\n\n\n");
        }
        //if only one is present
        else if(count == 1){
            System.out.println("only one "+ele+" is found in the array .....");
            System.out.println("Element "+ele+" is deleted successfully...\n\n\n\n");
            this.length -= 1;

        }
        //if more than one mentioned element is present
        else{
            this.length=this.length-count;
            System.out.println(count+" "+ele+"'s are found in the array....");
            System.out.println("Element's with value "+ele+" are  deleted successfully from the array...\n\n\n");
        }
        
    }

}

public class arrayClass{
    //m size of the array
    //n length of the array
    public static void main(String[] args){

        System.out.println("ARRAY USING CLASS PROGRAM STARTED......\n\n\n");
        Scanner sc=new Scanner(System.in);
        int m,n;
        
        //asking the user for the maximum capacity of the array
        System.out.println("Enter the size(Maximum capacity of the array) ");
        m=sc.nextInt();
        
        Array ar=new Array(m);
        
        int num=0;

        while(num!=7){
            System.out.println("Choose the operaions to perform on the array : ");
            System.out.println("1.Construct Array");
            System.out.println("2.Display Array");
            System.out.println("3.Insert Element into the Array");
            System.out.println("4.To know the maximum capacity of the Array");
            System.out.println("5.Current length of the Array");
            System.out.println("6.Delete element from the array");
            System.out.println("7.EXIT");
            num=sc.nextInt();
            switch(num){
                case 1:
                ar.constructArray();
                break;

                case 2:
                ar.displayArray();
                break;

                case 3:
                int x;
                System.out.println("Enter the value of the element.");
                x=sc.nextInt();
                ar.insertElement(x);
                break;

                case 4:
                System.out.println("Maximum capcaity of the array is "+ar.getSizeoftheArray());
                System.out.print("\n\n\n");
                break;

                case 5:
                System.out.println("Current length of the array is "+ar.getlengthoftheArray());
                System.out.print("\n\n\n");
                break;

                case 6:
                System.out.println("Enter the element to be deleted from the array...");
                int y=sc.nextInt();
                ar.deleteElementFromArray(y);
                break;

                case 7:
                System.out.println("Exiting........");
                System.out.println("EXITED FROM THE ARRAY CLASS");
                System.out.print("\n\n\n");
                System.exit(0);

                default:
                System.out.println("Invalid option entered.......???????\n\n\n");

            }
        }
    }
}