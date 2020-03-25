package _10_happy_pet;
import javax.swing.JOptionPane;

public class {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 pet = JOptionPane.showInputDialog("what pet do you want? Dog, Cat, Fish");
		while(happinessLevel<5) {
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "groom" }, null);
			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if (task==0) {
				feed();
			}
			if (task==1) {
				drink();
			}
			if (task==2) {
				groom();
			}
			if (happinessLevel==5) {
				JOptionPane.showMessageDialog(null, "Your pet is happy.");
			}
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feed() {
		happinessLevel+=1;
		if (pet.equalsIgnoreCase("Dog")) {
			JOptionPane.showMessageDialog(null, "dog barks");
		}
		else if(pet.equalsIgnoreCase("Cat")) {
			JOptionPane.showMessageDialog(null, "cat purrs");
		}
		else if(pet.equalsIgnoreCase("Fish")) {
			JOptionPane.showMessageDialog(null, "fish swims happily");
		}
	}
	static void drink() {
	happinessLevel+=1;
	if (pet.equalsIgnoreCase("Dog")) {
		JOptionPane.showMessageDialog(null, "dog wags tail and is now really happy");
	}
	if (pet.equalsIgnoreCase("Cat")) {
		JOptionPane.showMessageDialog(null, "cat falls into bowl and starts to get angry at you");
	}
	if (pet.equalsIgnoreCase("Fish")) {
		JOptionPane.showMessageDialog(null, "Fish is happy with new water");
	}
	}
	static void groom() {
	happinessLevel+=1;
	if (pet.equalsIgnoreCase("Dog")) {
	JOptionPane.showMessageDialog(null, "Dog barks");
}
if (pet.equalsIgnoreCase("Cat")) {
	JOptionPane.showMessageDialog(null, "Cat acted like a lion and tried to eat you but just scratched your arm");
}
if (pet.equalsIgnoreCase("Fish")) {
	JOptionPane.showMessageDialog(null, "Fish dies");
}	
}












}