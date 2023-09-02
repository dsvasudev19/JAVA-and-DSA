package simple;
public class PackageDemo1{
    public PackageDemo1(){
        System.out.println("DEFAULT CONSTRUCTOR IN PACKAGEDEMO1");
    }
    public double modTwo(double a,double b){
        return a%b;
    }
    public static void main(String[] args){
        System.out.println("PACKAGEDEMO1 IN SIMPLE PACKAGE");
    }
}