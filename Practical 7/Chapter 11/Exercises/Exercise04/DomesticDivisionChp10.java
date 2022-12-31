public class DomesticDivisionChp10 extends Division_Chp10
{
   protected String state;
   public DomesticDivisionChp10(String title, int acct, String st)
   {
      super(title, acct);
      state = st;
   }
   public void display()
   {
      System.out.println("Domestic Division_Chp10: " +
        divisionTitle + "  Acct #" + acctNum +
        "\nLocated in " + state);
   }
}

