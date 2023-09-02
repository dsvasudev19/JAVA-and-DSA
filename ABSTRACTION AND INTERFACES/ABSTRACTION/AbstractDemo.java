/* abstract classes may or may not contain abstract methods
we cannot instantiate abstract classes
methods need to be overriden 
no body for the abstract methods
*/
abstract class demo{
    abstract void display();
    abstract void show();
}
public class AbstractDemo extends demo{
    void display(){
        System.out.println("DISPLAY METHOD OVERRIDEN IN ABSTRACTDEMO CLASS");
    }
    void show(){
        System.out.println("SHOW METHOD OVERRIDEN IN ABSTRACTDEMO CLASS");
    }
    public static void main(String[] args){
        AbstractDemo ab=new AbstractDemo();
        ab.display();
        ab.show();
    }
}