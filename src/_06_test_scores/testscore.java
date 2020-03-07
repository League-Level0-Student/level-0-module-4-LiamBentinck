package _06_test_scores;

import javax.swing.JOptionPane;

public class testscore {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("what was your test score?");
		double test = Double.parseDouble(score);
		if(test == 100) {
			JOptionPane.showMessageDialog(null, "Good! Very good!\n\nunless your gavin.Then you stoopid");
		}
		else {
		JOptionPane.showMessageDialog(null, "to bad you didn't get a hundred. Hardy Har Har!\n\nyoure stoopid (Just like gavin!!!)");
		}
	}}
