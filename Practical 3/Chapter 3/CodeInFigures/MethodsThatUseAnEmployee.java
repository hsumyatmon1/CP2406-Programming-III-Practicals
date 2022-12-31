import java.util.Scanner;
class MethodsThatUseAnEmployee
{
   public static void main (String[] args)
   {
     Employee_Prac3_Chp03 myEmployee;
     myEmployee = getEmployeeData();
     displayEmployee(myEmployee);
   }
   public static Employee_Prac3_Chp03 getEmployeeData()
   {
      Employee_Prac3_Chp03 tempEmp = new Employee_Prac3_Chp03();
      int id;
      double sal;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter employee ID >> ");
      id = input.nextInt();
      tempEmp.setEmpNum(id);
      System.out.print("Enter employee salary >> ");
      sal = input.nextDouble();
      tempEmp.setEmpSalary(sal);
      return tempEmp;
   }
   public static void displayEmployee(Employee_Prac3_Chp03 anEmp)
   {
       System.out.println("\nEmployeeChp10 #" + anEmp.getEmpNum() +
          " Salary is " + anEmp.getEmpSalary());
   }
}
