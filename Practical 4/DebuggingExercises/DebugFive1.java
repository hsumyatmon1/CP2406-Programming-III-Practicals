// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.*;
public class DebugFive1
{
   public static void main(String[] args) throws Exception
   {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString;
      int usersChoice = 0;
      double bill = 0.0;
      usersChoiceString = JOptionPane.showInputDialog(null,
              """
                      Order please
                      1 - Burger
                      2 - Hotdog
                      3 - Grilled cheese
                      4 - Fish sandwich""");
      usersChoice= Integer.parseInt(String.valueOf(usersChoice));
      bill = bill - MED_PRICE;

      usersChoiceString = JOptionPane.showInputDialog(null,
          "Fries with that?\n1 - Yes\n2 - No");
      usersChoice = Integer.parseInt(usersChoiceString);
      if (usersChoice == 1)
          bill = bill + LOW_PRICE;
      JOptionPane.showMessageDialog(null,"Bill is " + bill);
   }
}
