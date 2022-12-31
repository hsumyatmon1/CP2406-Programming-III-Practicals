public abstract class UseDivision
{
   public static void main(String[] args)
   {
      DomesticDivisionChp10 abcDomDiv = new
		      DomesticDivisionChp10("Sales", 123, "California");
      DomesticDivisionChp10 xyzDomDiv = new
		      DomesticDivisionChp10("Technology", 234, "Kansas");
      InternationalDivisionChp10 abcIntDiv = new
		      InternationalDivisionChp10("Technology", 345, "Germany", "German");
      InternationalDivisionChp10 xyzIntDiv = new
		      InternationalDivisionChp10("Marketing", 456, "Japan",
         "Japanese");
      abcDomDiv.display();
      xyzDomDiv.display();
      abcIntDiv.display();
      xyzIntDiv.display();
   }
}

