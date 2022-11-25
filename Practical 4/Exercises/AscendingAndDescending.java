import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {

        int one, two, three;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter the first number >>> ");
        one = inputDevice.nextInt();
        System.out.print("Enter the second number >>> ");
        two = inputDevice.nextInt();
        System.out.print("Enter the third number >>> ");
        three = inputDevice.nextInt();

        System.out.println("The numbers in ascending order: ");

        if (one < two && one < three){
            System.out.println(one);
            if (two < three) {
                System.out.println(two);
                System.out.println(three);
            }
            else {
                System.out.println(three);
                System.out.println(two);
            }
        }
        else if (two < one && two < three){
            System.out.println(two);
            if (one < three) {
                System.out.println(one);
                System.out.println(three);
            }
            else {
                System.out.println(three);
                System.out.println(one);
            }
        }
        else {
            System.out.println(three);
            if (two < one) {
                System.out.println(two);
                System.out.println(one);
            }
            else {
                System.out.println(one);
                System.out.println(two);
            }
        }

        System.out.println("The numbers in descending order: ");

        if (one > two && one > three){
            System.out.println(one);
            if (two > three) {
                System.out.println(two);
                System.out.println(three);
            }
            else {
                System.out.println(three);
                System.out.println(two);
            }
        }
        else if (two > one && two > three){
            System.out.println(two);
            if (one > three) {
                System.out.println(one);
                System.out.println(three);
            }
            else {
                System.out.println(three);
                System.out.println(one);
            }
        }
        else {
            System.out.println(three);
            if (two > one) {
                System.out.println(two);
                System.out.println(one);
            }
            else {
                System.out.println(one);
                System.out.println(two);
            }
        }


    }
}
