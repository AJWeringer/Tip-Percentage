//***********************************************************
// Name:  Anthony Weringer
// Title: Assignment1.java
// Description: 3 part assignment: tempconverter, questions, tip on bill
// Time spent: 120 minutes
// Date: 8/20/17
// Part1
// A) Changing the name created an error because the class that is expected based on the name does not match what is written in the code
// B) The program fails to recognize celsius and temperature as variables and also fails to recognize them as usable commands.
// C) The program fails to see it as a complete statement and tells you to add ; to complete the statement, the program is looking for that semi colon to run the program
// D) The program failed to run, it recognized that the last bracket was missing, read as an unresolved compilation problem and asked to insert the bracket "}" to complete the ClassBody
// E) The program said fahrenheitTemp cannot be resolved to a variable, there was no matching definition so to speak, so the program does not know what you are referring to
// Part2
// 1) A) mystery is equal to 5
//    B) Mystery is equal to 3
//    C) Mystery is equal to 4
//
// 2) A) 0
//    B) 3.3333333333333335
//    C) 2
//    D) 4.3
//    E) 0.24806201550387597
//    F) 1
//    G) 1
//
// Part 3
//***********************************************************


import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment1 
{
	public static void main (String[] args)
	{
		double bill, tipAmt, total;
		int tipPct; /* variables for the bill, amount and total */
		
		Scanner sc = new Scanner(System.in);
		NumberFormat crncy = NumberFormat.getCurrencyInstance(); /* set-up input scanner, and format for numbers to be a currency */
		
		System.out.println("How much should i tip?");
		System.out.println("Enter total: ");
		bill=sc.nextDouble(); /* program intro, first prompt user will see, and store it as the bill */
		
		System.out.println("Enter tip percentage: ");
		tipPct=sc.nextInt(); /* second input prompt, asking for the percentage and storing it as a percentage */
		
		tipAmt = tipPct * .01 * bill;
		total = bill + tipAmt; /* command to calculate total tip, as well as total amount user should pay */
		
		System.out.println("Your bill is: " + crncy.format(bill));
		System.out.println("Tip percentage is: " + tipPct);
		System.out.println("Your tip should be: " + crncy.format(tipAmt));
		System.out.println("You should pay: " + crncy.format(total)); /*output of the numbers so user can see and verify the correct amount */
		
		
	}
}
