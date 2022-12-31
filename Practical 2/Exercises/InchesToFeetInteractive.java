import java.util.Scanner;

public class InchesToFeetInteractive {
	public static void main(String[] args) {
		int total_inches;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter the total inches >>> ");
		total_inches = inputDevice.nextInt();
		int feet = total_inches / 12;
		int inches = total_inches % 12;
		System.out.println("Total inches " + total_inches + " is equal to " + feet + " feet and " + inches + " inches");
	}
}
