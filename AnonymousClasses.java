class Student{
    Student(){
        System.out.println("in class constructor");
    }
    public void showMessage(){
        System.out.println("in class");
    }
}




public class AnonymousClasses {
    public static void main(String[] args) {
        Student s=new Student(){
            {
                System.out.println("THIS IS DEFAULT CONSTRUCTOR ....");
            };
            public void showMessage(){
                System.out.println("this is show method in anonymous class .... ");
            }
        };
        s.showMessage();


    }
}
