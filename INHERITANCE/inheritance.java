import java.util.*;

class University{
    void conductExams(){
        System.out.println("THIS IS UNDER UNIVERSITY CLASS");

    }
}
class colleges extends University{
    void conductExams(){
        System.out.println("this is under college class");
    }
}



public class inheritance{
    public static void main(String args[]){
        University u=new colleges();
        u.conductExams();
    }

}