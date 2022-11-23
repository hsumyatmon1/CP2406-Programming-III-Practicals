public class Eggs {
    public static void main(String[] args){
        int ordered_eggs = 27;
        final int DOZEN = 12;
        final float DOZEN_EGGS_PRICE = 3.25F;
        final float ONE_EGG_PRICE = 0.45F;
        int total_dozen = ordered_eggs / DOZEN;
        int total_loose = ordered_eggs % DOZEN;
        float total_price = (total_dozen * DOZEN_EGGS_PRICE) + (total_loose * ONE_EGG_PRICE);

        System.out.println("You ordered " + ordered_eggs + " egg. That's " + total_dozen + " dozen at " + DOZEN_EGGS_PRICE + " per dozen and " + total_loose + " loose eggs at " + ONE_EGG_PRICE + " cents each for a total of $" + total_price +".");
    }
}
