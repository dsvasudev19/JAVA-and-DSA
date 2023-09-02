/*
Functionl interfaces are the interfaces which contain one and only one method
but we can also include toString method in the functional interface because 
every class is the sub class of Object class so the function toString is from the Object hence it will 
not throw an error if we include it
*/

interface functionalDemo{
    void show(); 
}

// class NonFunctional implements functionalDemo{
//     public void show(){
//         System.out.println("SHOW METHOD OVERRIDEN IN EXAMPLE CLASS FROM THE FUNCTIONAL DEMO INTERFACE");
//     }
// }
public class LambdaDemo{
    public static void main(String[] args){
        // NonFunctional e=new NonFunctional(){
        //     {
        //         System.out.println("anonymous class constructor");
        //     }

        // };
        // INSTEAD OF WRITING THE CLASS NonFunctional and writing overriden method in it 
        // we can also write the same thing with the concept of anonymous classes and lambda functions

        functionalDemo e = () -> {
            System.out.println("SHOW METHOD OVERRIDEN IN EXAMPLE CLASS FROM THE FUNCTIONAL DEMO INTERFACE");
        };

        e.show();
    }
}

