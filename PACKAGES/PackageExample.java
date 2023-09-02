package Example;
import simple.*;

public class PackageExample{
    public static void main(String []ar){
        PackageDemo p=new PackageDemo();
        System.out.println(p.addTwo(5,3));
        System.out.println(p.diffTwo(10,50));
        System.out.println(p.proTwo(8,9));
        PackageDemo1 p1=new PackageDemo1();
        System.out.println(p1.modTwo(50,6));
    }
}

// javac -d directory filename.java -->for compiling the package , --> directory is the location to store the package
// to store the package in current working directory then replace directory with . -->>like>>>> javac -d . filename.java
// java packagename.classname --> for running the package
// 