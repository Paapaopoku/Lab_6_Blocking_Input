import java.util.Random;
import java.util.Scanner;

public class HighOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int guess = 0;
        int min = 1;
        int max = 10;
        boolean done = false;


        do{
            System.out.print("Enter a number between [1 - 10]: ");
            guess = in.nextInt();
            if(guess < min || guess > max)
            {
                System.out.println("Please enter a number in between [1 - 10]");
            }

            else if(guess < val)
            {
                System.out.println("Your number is low");
                in.nextLine();
            }
            else if(guess > val)
            {
                System.out.println("Your number is high");
                in.nextLine();
            }
            else
            {
                System.out.println("You guessed the correct number!");
                in.nextLine();
                done = true;
            }
        }while (!done);
    }
}
