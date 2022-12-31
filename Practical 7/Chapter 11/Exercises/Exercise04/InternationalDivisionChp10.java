public class InternationalDivisionChp10 extends Division_Chp10
{
   protected String country;
   protected String language;
   public InternationalDivisionChp10(String title, int acct, String cty, String lang)
   {
      super(title, acct);
      country = cty;
      language = lang;
   }
   public void display()
   {
      System.out.println("International Division_Chp10: " + divisionTitle +
         "  Acct #" + acctNum + "\nLocated in " + country +
         " Language is " + language);
   }
}

