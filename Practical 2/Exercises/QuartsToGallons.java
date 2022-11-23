public class QuartsToGallons {
    public static void main(String[] args){
        final int QUARTS_IN_GALLON = 4;
        int NoOfQuarts = 18;
        System.out.println("A job that needs " + NoOfQuarts + "requires " +
                (NoOfQuarts / QUARTS_IN_GALLON) + " gallons plus " + (NoOfQuarts % QUARTS_IN_GALLON) + " quarts.");

    }
}