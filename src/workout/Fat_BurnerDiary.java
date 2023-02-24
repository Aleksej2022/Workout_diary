package workout;

import java.util.Scanner;

public class Fat_BurnerDiary {

    /*
    * This code is used to record the work out entries of a user from Monday to Wednesday
    * There are two scanner objects created
    * The user's entries have been displayed in specific formats using various format specifiers
    * like string, decimal, integer
    * Specific character width spacing has been implemented to format the position of information that the user has entered
    */



    public static void main(String[] args) {
        // Creating scanner objects of the scanner class to receive input from the user
        Scanner object_2 = new Scanner(System.in); // this scanner object is for integer entry
        Scanner object_3 = new Scanner(System.in); // this scanner object is for string entry
        // This is the Monday workout entry
        System.out.println("Monday");

        System.out.println("Day:- ");
        int day_1 = object_2.nextInt();

        System.out.println("Month(the first three letters):- ");
        String month_1 = object_3.nextLine();

        System.out.println("Year(four digit):- ");
        String year_1 = object_3.nextLine();

        System.out.println("How long did you workout for?(in minutes) ");
        int workout_period = object_2.nextInt();

        System.out.println("What is the workout name?(pushups,jogging,walking,running) ");
        String workout_name = object_3.nextLine();

        // This is the Tuesday workout entry
        System.out.println("Tuesday");

        System.out.println("Day:- ");
        int day_2 = object_2.nextInt();

        System.out.println("Month(the first three letters):- ");
        String month_2 = object_3.nextLine();

        System.out.println("Year(four digit):- ");
        String year_2 = object_3.nextLine();

        System.out.println("How long did you workout for?(in minutes) ");
        int workout_period2 = object_2.nextInt();

        System.out.println("What is the workout name?(pushups,jogging,walking,running) ");
        String workout_name2 = object_3.nextLine();


        // This is the Wednesday workout entry
        System.out.println("Wednesday");

        System.out.println("Day:- ");
        int day_3 = object_2.nextInt();

        System.out.println("Month(the first three letters):- ");
        String month_3 = object_3.nextLine();

        System.out.println("Year(four digit):- ");
        String year_3 = object_3.nextLine();

        System.out.println("How long did you workout for?(in minutes) ");
        int workout_period3 = object_2.nextInt();

        System.out.println("What is the workout name?(pushups,jogging,walking,running) ");
        String workout_name3 = object_3.nextLine();

        System.out.printf("%20s","Days of the week");
        System.out.printf("%20s","Date");
        System.out.printf("%20s","Duration");
        System.out.printf("%20s%n","Workout name");

        System.out.printf("%10s","Mon");
        System.out.printf("%25d %s %s ",day_1, month_1, year_1);

        System.out.printf("%10d",workout_period);
        System.out.printf("%25s",workout_name);

        System.out.println();

        System.out.printf("%10s","Tue");
        System.out.printf("%25d %s %s ",day_2, month_2, year_2);

        System.out.printf("%10d",workout_period2);
        System.out.printf("%25s",workout_name2);

        System.out.println();


        System.out.printf("%10s","Wed");
        System.out.printf("%25d %s %s ",day_3, month_3, year_3);

        System.out.printf("%10d",workout_period3);
        System.out.printf("%25s",workout_name3);
    }

}
