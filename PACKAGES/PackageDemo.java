package simple;
public class PackageDemo{
    public PackageDemo(){
        System.out.println("DEFAULT CONSTRUCTOR IN PACKAGEDEMO");
    }
    public int addTwo(int a,int b){
        return a+b;
    }
    public int diffTwo(int a,int b){
        return (a>b)?(a-b):(b-a);
    }
    public int proTwo(int a,int b){
        return a*b;
    }
    public double divTwo(double a,double b){
        try{
            return (a>b)?(a/b):(b/a);
        }catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("CLASS PACKAGE DEMO IN SIMPLE PACKAGE");
    }
}