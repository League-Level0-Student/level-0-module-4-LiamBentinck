import javax.swing.JOptionPane;

public class ownadventure {
public static void main(String[] args) {
	String choose1 = JOptionPane.showInputDialog("Where do you want to go. Left to the swamp or right to the castle?");
	if (choose1.equalsIgnoreCase("Right")) {
		JOptionPane.showMessageDialog(null, "at the castle the archers shoot you and you die a painfull gory death as the arrow rips through the air and impales your right eye.");
	}
	if (choose1.equalsIgnoreCase("Left")) {
		String choose2 = JOptionPane.showInputDialog(null, "you walk through the swamp. To the left is the lake and to the right is a shady path that leads to a jungle/forest with smoke coming from a chimmeny. Left or right?");
	
	if (choose2.equalsIgnoreCase("Left")) {
		String choose3 = JOptionPane.showInputDialog(null, "you tripped and fell in the swamp. Do you want to swim around or get up and walk? Swim or Walk?");
		if (choose3.equalsIgnoreCase("Swim")) {
		JOptionPane.showMessageDialog(null, "A crocidle comes up starts to aproach you. Before you can do anything, it starts to chew your leg and brings you underwater. Blood clouds in your eyes and you die from loss of blood and from being drowned. ");	
	}
		if (choose3.equalsIgnoreCase("Walk")) {
			JOptionPane.showMessageDialog(null, "A witch pops out of the trees and eats your head. :}");
	}
	}
	if (choose2.equalsIgnoreCase("Right")) {
		JOptionPane.showMessageDialog(null, "As you make your way through the forest/jungle you get to the chimmney. It is a house and witch comes out and starts to eat you.");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}




