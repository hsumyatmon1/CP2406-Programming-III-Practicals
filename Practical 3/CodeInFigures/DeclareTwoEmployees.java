public class DeclareTwoEmployees
{
   public static void main(String[] args)
   {
      Employee_Prac3 clerk = new Employee_Prac3();
      Employee_Prac3 driver = new Employee_Prac3();
      clerk.setEmpNum(345);
      driver.setEmpNum(567);
      System.out.println("The clerk's number is " +
        clerk.getEmpNum() + " and the driver's number is " +
        driver.getEmpNum());
   }
}
