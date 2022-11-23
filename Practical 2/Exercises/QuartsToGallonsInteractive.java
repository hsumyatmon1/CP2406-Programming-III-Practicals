import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        final int QUARTS_IN_GALLON = 4;
        int NoOfQuarts;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of paint in quarts >>>");
        NoOfQuarts = inputDevice.nextInt();
        System.out.println("A job that needs " + NoOfQuarts + "requires " +
                (NoOfQuarts / QUARTS_IN_GALLON) + " gallons plus " + (NoOfQuarts % QUARTS_IN_GALLON) + " quarts.");
    }
}
