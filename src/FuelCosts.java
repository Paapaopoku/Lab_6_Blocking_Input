import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args)
    {
        double gallons = 0.0;
        double fuelEff = 0.0;
        double priceGas = 0.0;
        boolean done = false;
        boolean finish = false;
        boolean line = false;

        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter the number of gallons in your tank: ");
            if(in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();
                System.out.println("The number of gallons in your tank is " + gallons);
                done = true;
            }
            else
            {
                System.out.println("This is not a valid input");
                in.nextLine();
            }
        }while (!done);

        do{
            System.out.print("Enter your fuel efficiency: ");
            if(in.hasNextDouble())
            {
                fuelEff = in.nextDouble();
                in.nextLine();
                System.out.println("The number of gallons in your tank is " + fuelEff);
                finish = true;
            }
            else
            {
                System.out.println("This is not a valid input");
                in.nextLine();
            }
        }while (!finish);

        do{
            System.out.print("Enter your price for gas: ");
            if(in.hasNextDouble())
            {
                priceGas = in.nextDouble();
                in.nextLine();
                System.out.println("The price of gas per gallon for you is " + priceGas);
                line = true;
            }
            else
            {
                System.out.println("This is not a valid input");
                in.nextLine();
            }
        }while (!line);

        double costPer100Miles = (100/fuelEff) * priceGas;
        double distance = gallons * fuelEff;

        System.out.println("The Cost per 100 miles is: " + costPer100Miles);
        System.out.println("The Car can go " + distance + " miles with the gas in the tank");
    }
}
