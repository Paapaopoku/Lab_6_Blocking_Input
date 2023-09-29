import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int height = 0;
        int width = 0;
        boolean done = false;
        boolean finish = false;

        do{
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextInt())
            {
                height = in.nextInt();
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
            if(in.hasNextInt())
            {
                width = in.nextInt();
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

        int length = (height * height) + (width * width);
        int area = width * height;
        int perimeter = (width + height) * 2;


        System.out.println("The length of the rectangle is " + length);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);

    }
}
