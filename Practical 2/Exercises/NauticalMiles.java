public class NauticalMiles {
    public static void main(String[] args){
        int total_inches = 20;
        int feet = total_inches / 12;
        int inches = total_inches % 12;
        System.out.println("Total inches " + total_inches + " is equal to " + feet + " feet and " + inches + " inches");
    }
}
