interface college{
    void display();
}


public class LambdaExpression {
    public static void main(String[] args) {
        college c=()->{
            System.out.println("DISPLAY METHOD FROM THE COLLEGE INTERFACE ");
        };
        c.display();
    }
}
