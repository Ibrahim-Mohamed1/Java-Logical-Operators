// Ibrahim Mohamed
package usinglogicaloperatorsibrahimmohamed;

import javax.swing.JOptionPane;

public class UsingLogicalOperatorsIbrahimMohamed
{

    public static void main(String[] args)
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Pick any number: "));

        if (input % 5 == 0 && input % 6 == 0)
        {
            System.out.println(input + " is evenly divisible by both 5 and 6.");
        }
        if (input % 5 == 0 || input % 6 == 0)
        {
            System.out.println(input + " is evenly divisible by 5 or 6.");
        }
        if (input % 5 == 0 ^ input % 6 == 0)
        {
            System.out.println(input + " is evenly divisible by 5 or 6, but not both.");
        }
    }
}
