import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int number;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a number >>> ");
        number = inputDevice.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is an even number.");
        }
        else {
            System.out.println("The number is an odd number.");
        }
    }
}
