/*
interfaces in java enables to implement multiple inheritance
all the methods in interface are by default abstract and need to be overriden
*/
interface Animal{
    void bark();
}
interface LargeAnimal{
    void Strong();
}

class Cat implements Animal{
    public void bark(){
        System.out.println("bark method from cat class");
    }
}
class Dog implements Animal{
    public void bark(){
        System.out.println("bark method form dog class");
    }
}
class Buffalo implements Animal,LargeAnimal{
    public void bark(){
        System.out.println("bark method from Buffalo class");
    }
    public void Strong(){
        System.out.println("dunna method from dunnapothu interface implemented by buffalo class");
    }
}
public class InterfaceDemo{
    public static void main(String[] args){
        Buffalo b=new Buffalo();
        b.Strong();
        b.bark();
        Dog d=new Dog();
        d.bark();
        Cat c=new Cat();
        c.bark();
    }
}