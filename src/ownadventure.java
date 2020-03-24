import javax.swing.JOptionPane;

public class ownadventure {
public static void main(String[] args) {
	String choose1 = JOptionPane.showInputDialog("Where do you want to go. Left to the swamp or right to the castle?");
	if (choose1.equalsIgnoreCase("Right")) {
		JOptionPane.showMessageDialog(null, "at the castle the archers shoot you and you die a painfull gory death as the arrow rips through the air and impales your right eye.");
	}
	if (choose1.equalsIgnoreCase("Left")) {
		String choose2 = JOptionPane.showInputDialog(null, "you push through the swamp. To the left is the lake and to the right is a shady path that leads to a jungle/forest with smoke coming from a chimmeny. Left or right?");
	}
	if (choose2.equalsIgnoreCase("Left")) {
		JOptionPane.showMessageDialog(null, "you tripped and drowned in the swamp.");
	}
	if (choose2.equalsIgnoreCase("Right")) {
		JOptionPane.showMessageDialog(null, "As you make your way through the forest/jungle you get to the chimmney. It is a house a witch comes out and eats you.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}




