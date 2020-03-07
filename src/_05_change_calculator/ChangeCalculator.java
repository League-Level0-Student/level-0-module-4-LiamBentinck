package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nick = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nl = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
		String dimes =JOptionPane.showInputDialog("how many dimes do you have?");
		int dime = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
		String Quarter = JOptionPane.showInputDialog("how many quarters do you have?");
		int quarters = Integer.parseInt(Quarter);
		// Calculate how much money the user has and save it in a double variable 
		double total = nl + dime + quarters;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, total);
	}
}

