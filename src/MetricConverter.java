import java.util.Scanner;

public class MetricConverter
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        boolean done = false;

        do{
            System.out.print("Enter a number in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                System.out.println("You entered " + meters + " meters");
                done = true;
            }
            else
            {
                System.out.println("This is not a valid input");
                in.nextLine();
            }
        }while (!done);

        double miles = meters * 0.000621;
        double feet = meters * 3.37;
        double inches = feet * 12;

        System.out.println("Your number in miles is " + miles);
        System.out.println("Your number in feet is " + feet );
        System.out.println("Your number in inches is " + inches);
    }
}
