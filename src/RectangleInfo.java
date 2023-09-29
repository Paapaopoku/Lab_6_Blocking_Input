import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        boolean done = false;
        boolean finish = false;

        do{
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;
                System.out.println("The height of the rectangle is " + height);
            }
            else
            {
                System.out.println("This is not a valid input");
                in.nextLine();
            }
        }while (!done);

        do{
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                finish = true;
                System.out.println("The width of the rectangle is " + width);
            }
            else
            {
                System.out.println("This is not a valid input");
                in.nextLine();
            }
        }while (!finish);

        double length = (height * height) + (width * width);
        double area = width * height;
        double perimeter = (width + height) * 2;


        System.out.println("The length of the rectangle is " + length);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);

    }
}
