public class switchCase {
    public static void main(String[] args) {
        String day="monday";

        switch(day){
            case "monday" -> System.out.println("weekday");
            case "tuesday" -> System.out.println("weekday..");
            default -> System.out.println("holiday");
        }
    }
}
