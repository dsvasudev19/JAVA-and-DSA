//hashing
/*
collision avoiding techniques 
1.linear probing
2.quadratic probing
*/
/*    

here 
hashtable is the table storing the buckets
and size is the total number of buckets in the hashtable 
hash is the function used for calculating the hash key
two probing techniques have been implemented in it(linearProbing and quadraticProbing)
 */

public class hashing{
    int size=20;
    int hashTable[]=new int[size];
    hashing(){
        System.out.println("DEMONSTRATION OF HASHING WITHOUT USING ANY COLLECTIONS");
        for(int i=0;i<size;i++){
            hashTable[i]=0;
        }
    }
    int hash(int key){
        return key%size;
    }
    int linearProbe(int h[],int key){
        int i=hash(key);
        int j=0;
        while(h[(i+j)%size] != 0){
            j++;
        }
        return (i+j)%size;
    }
    int quadraticProbe(int h[],int key){
        // h(key)=[hash(key)+i*i]%size;
        int index=hash(key);
        int i=0;
        while(h[(index+i*i)%size]!=0){
            i++;
        }
        return (index+i*i)%size;
    }
    void insert(int h[],int key){
        int index=hash(key);
        if(hashTable[index]!=0){
            index=quadraticProbe(h,key);
            h[index]=key;
        }
        else{
            h[index]=key;
        }
    }
    public static void main(String[] args){
        hashing h=new hashing();
        h.insert(h.hashTable,3);
        h.insert(h.hashTable,4);
        h.insert(h.hashTable,5);
        h.insert(h.hashTable,15);
        h.insert(h.hashTable,13);
        h.insert(h.hashTable,23);
        h.insert(h.hashTable,35);


        System.out.println("HASH TABLE:");
        for(int i=0;i<h.size;i++){
            System.out.println(i+" "+h.hashTable[i]);
        }
    }
}