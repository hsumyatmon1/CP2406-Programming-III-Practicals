public class Billing {
    public static void main(String[] args){
        double testing1 = computeBil(100);
        double testing2 = computeBil(100, 2);
        double testing3 = computeBil(100, 2, 10);

        System.out.println("Testing 1 >>> Total Cost = " + testing1 );
        System.out.println("Testing 2 >>> Total Cost = " + testing2 );
        System.out.println("Testing 3 >>> Total Cost = " + testing3 );


    }

    public static double computeBil(double photoBookPrice){
        return photoBookPrice * 108 / 100;
    }

    public static double computeBil(double photoBookPrice, int orderQty){
        return (photoBookPrice * orderQty) * 108 / 100;
    }

    public static double computeBil(double photoBookPrice, int orderQty, double couponValue){
        return ((photoBookPrice * orderQty) - couponValue) * 108 / 100;
    }

}
