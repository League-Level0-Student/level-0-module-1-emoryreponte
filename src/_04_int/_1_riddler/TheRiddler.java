package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question1 = JOptionPane.showInputDialog("what time is it folks");
		if (question1.equals("Its T-V TIME")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 100;
		}
		else {
			JOptionPane.showMessageDialog(null, "Ohh sorry, the correct answer was (Its T-V Time)");
		}
		JOptionPane.showMessageDialog(null, "your score right now is... " + score);
		String question2 = JOptionPane.showInputDialog("What the abriviation for I Dont Know");
		if (question2.equals("IDK")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 100;
		}
		else {
			JOptionPane.showMessageDialog(null, "Ohh sorry, the correct answer was (IDK)");
		}
		JOptionPane.showMessageDialog(null, "your score right now is... " + score);
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

