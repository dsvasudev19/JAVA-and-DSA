// public class switchCase {
//     public static void main(String[] args) {

//         int month = 8;
//         String monthString;
//         switch (month) {
//             case 1 ->  monthString = "January";
                     
//             case 2 ->  monthString = "February";
                    
//             case 3 ->  monthString = "March";
                     
//             case 4 ->  monthString = "April";
                     
//             case 5 ->  monthString = "May";
                     
//             case 6 ->  monthString = "June";
                     
//             case 7 ->  monthString = "July";
                     
//             case 8 ->  monthString = "August";
                     
//             case 9 ->  monthString = "September";
                     
//             case 10 -> monthString = "October";
                     
//             case 11 -> monthString = "November";
                     
//             case 12 -> monthString = "December";
                     
//             default-> monthString = "Invalid month";
                   
//         }
//         System.out.println(monthString);
//     }
// }




// public class switchCase {
//     public static void main(String[] args) {

//         int month = 8;
//         String monthString=switch (month) {
//             case 1 ->  "January";
                     
//             case 2 ->  "February";
                    
//             case 3 ->  "March";
                     
//             case 4 ->  "April";
                     
//             case 5 ->  "May";
                     
//             case 6 ->  "June";
                     
//             case 7 ->  "July";
                     
//             case 8 ->  "August";
                     
//             case 9 ->  "September";
                     
//             case 10 -> "October";
                     
//             case 11 -> "November";
                     
//             case 12 -> "December";
                     
//             default-> "Invalid month";
                   
//         };
//         System.out.println(monthString);
//     }
// }


public class switchCase {
    public static void main(String[] args) {

        int month = 8;
        String monthString = switch (month) {
            case 1 : yield "January";

            case 2 : yield "February";

            case 3 : yield "March";

            case 4 : yield "April";

            case 5 : yield "May";

            case 6 : yield "June";

            case 7 : yield "July";

            case 8 : yield "August";

            case 9 : yield "September";

            case 10 : yield "October";

            case 11 : yield "November";

            case 12 : yield "December";

            default : yield "Invalid month";

        };
        System.out.println(monthString);
    }
}